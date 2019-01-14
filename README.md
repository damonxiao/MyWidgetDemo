# MyWidgetDemo
自定义的控件集的DEMO

＃＃ 1. CircleProgressView，自定义的圆形ProgressView
＃＃＃ 使用方式，Builder模式，Demo代码如下
```java
private void testCircleProgressView() {
        CircleProgressView circleProgressView = new CircleProgressView.Builder(this)
                .setProgress(10 * 1000, 10)
                .setProgressBackgroundResource(R.drawable.circle_progress_view_bg)
                .setProgressImageResource(R.drawable.circle_progress_view_progress)
                .create();
        ViewGroup viewGroup = findViewById(R.id.view_container);
        viewGroup.addView(circleProgressView);

        circleProgressView.showProgress(null);
    }
```
