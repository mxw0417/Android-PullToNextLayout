package com.mingle.example;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class ScrollViewFragment extends Fragment {




    String title=" 谷歌仍是毕业生心目中的最佳雇主";

    String content="    网易科技讯 3月27日消息，调研公司Universum Global发布最新调查报告称，谷歌仍是计算机科学专业大学生心目中的最佳雇主。\n" +
            "\n" +
            "这份调查覆盖了275所大学超过3200名计算机科学专业大学生。调查发现，谷歌在大学生心目中是最佳雇主，紧随其后的是微软、苹果、亚马逊和Facebook。此次调查并未纳入Uber和Airbnb等初创公司，原因在于这些公司不会大规模招聘毕业生。\n" +
            "\n" +
            "自2008年Universum开始追踪大学生心目中的最佳雇主以来，谷歌一直是计算机科学专业大学生心目中的最佳雇主。调查称，该专业的大学生中，大部分人认为谷歌拥有创新、灵活的工作环境。值得一提的是，谷歌的受欢迎程度还在上升，今年超过50%的受访学生支持谷歌，略高于去年。\n" +
            "\n" +
            "尽管软件公司成为榜单的“主角”，去年，包括达美航空和美国航空集团在内的航空公司的受欢迎程度同样大幅上升。此外，亚马逊和星巴克等零售企业的表现也不错。\n" +
            "\n" +
            "整个市场对于毕业生的需求正在发生变化。随着经济的复苏，更多公司选择到校园直接招聘毕业生，越来越多的计算机专业毕业生一毕业就找到了工作。调查显示，每位计算机科学专业的毕业生可以挑选34.4家雇主，高于2012年的26.4家，列在所有专业的首位。\n" +
            "\n" +
            "调查显示，所有的学生在找工作时压力减轻，相信能有更多工作选择。例如，招聘初期就给学生发offer的银行、咨询和审计公司有可能会收到求职者“或许会接受offer”的回复，因为这些学生还在等待来自消费品、零售和科技公司的offer。\n" +
            "\n" +
            "因此，雇主发现，使用向求职者施压，威胁2天内不回复就取消offer的招聘策略已经没以前那么有效果了。（思远）";


    private int  index;
    public ScrollViewFragment(int index) {

      this.index=index;
    }





    private ScrollView scrollView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View   v= inflater.inflate(R.layout.test_content, container, false);



        TextView titleTV= (TextView) v.findViewById(R.id.titleTV);
        TextView contentTv= (TextView) v.findViewById(R.id.textView);
        scrollView= (ScrollView) v.findViewById(R.id.scrollView);


        titleTV.setText(index+1+".0"+title);
        contentTv.setText(content);


        return  v;
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if(!isVisibleToUser){

            if(scrollView!=null)
            scrollView.pageScroll(ScrollView.FOCUS_UP);
        }
    }
}
