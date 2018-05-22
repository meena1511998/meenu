static void Rotate(int[] arr, int k)
{
int n = arr.Length;
k = k % n;
int count = 0;
int start = k;

while (count < n)
{
int index = start;
int prev = arr[(start - k + n) % n];
do
{
int temp = arr[index];
arr[index] = prev;
prev = temp;
index = (index + k) % n;
count++;
}
while (index != start && count < n);

start = (start + 1) % n;
}
}
