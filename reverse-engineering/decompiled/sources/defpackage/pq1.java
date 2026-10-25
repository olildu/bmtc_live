package defpackage;

import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import so.plotline.insights.Listeners.a;
import so.plotline.insights.Modal.b;
import so.plotline.insights.Modal.c;
import so.plotline.insights.Modal.d;
import so.plotline.insights.Modal.h;
import so.plotline.insights.Modal.i;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class pq1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19060a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pq1(LinearLayout linearLayout, Object obj, Object obj2, int i) {
        this.f19060a = i;
        this.b = linearLayout;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f19060a;
        Object obj = this.d;
        Object obj2 = this.c;
        LinearLayout linearLayout = this.b;
        switch (i) {
            case 0:
                String str = ((b) linearLayout).b.b;
                ((a) obj2).c((Integer) obj, Boolean.TRUE, new ArrayList());
                break;
            case 1:
                int i2 = so.plotline.insights.OptionModals.b.d;
                ((so.plotline.insights.OptionModals.b) linearLayout).setState("SELECTED");
                new Handler().postDelayed(new ao1(12, (j4) obj2, (String) obj), 500L);
                break;
            case 2:
                String str2 = ((c) linearLayout).b.b;
                ((a) obj2).c((Integer) obj, Boolean.TRUE, new ArrayList());
                break;
            case 3:
                String str3 = ((d) linearLayout).b.b;
                ((a) obj2).c((Integer) obj, Boolean.TRUE, new ArrayList());
                break;
            case 4:
                String str4 = ((h) linearLayout).b.b;
                ((a) obj2).c((Integer) obj, Boolean.TRUE, new ArrayList());
                break;
            default:
                String str5 = ((i) linearLayout).b.b;
                ((a) obj2).c((Integer) obj, Boolean.TRUE, new ArrayList());
                break;
        }
    }
}
