package defpackage;

import android.view.View;
import android.widget.PopupMenu;
import androidx.media3.ui.PlayerControlView;
import com.adster.sdk.mediation.adster.AdFullScreenActivity;
import com.adster.sdk.mediation.customevent.AdSterCustomEventNativeAd;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.inmobi.media.C2535k2;
import com.inmobi.media.C2597o8;
import com.inmobi.media.O6;
import so.plotline.insights.FlowViews.FullPageDialog.a;
import so.plotline.insights.FlowViews.Stories.c;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15874a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i1(Object obj, int i) {
        this.f15874a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f15874a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AdFullScreenActivity.onCreate$lambda$0((AdFullScreenActivity) obj, view);
                break;
            case 1:
                AdSterCustomEventNativeAd.AdSterMediationNativeAdMapper.trackViews$lambda$8$lambda$7((AdSterCustomEventNativeAd.AdSterMediationNativeAdMapper) obj, view);
                break;
            case 2:
                ((PopupMenu) obj).show();
                break;
            case 3:
                MaterialDatePicker materialDatePicker = (MaterialDatePicker) obj;
                materialDatePicker.n0.setEnabled(materialDatePicker.j().t());
                materialDatePicker.l0.toggle();
                materialDatePicker.a0 = materialDatePicker.a0 == 1 ? 0 : 1;
                materialDatePicker.n(materialDatePicker.l0);
                materialDatePicker.m();
                break;
            case 4:
                O6.a((O6) obj, view);
                break;
            case 5:
                ((PlayerControlView) obj).onFullScreenButtonClicked(view);
                break;
            case 6:
                a aVar = (a) obj;
                so.plotline.insights.a.f fVar = aVar.b;
                String str = aVar.f19371a.b;
                Boolean bool = Boolean.TRUE;
                fVar.a(bool, bool, str, null, null, null, null);
                break;
            case 7:
                so.plotline.insights.OptionModals.a aVar2 = (so.plotline.insights.OptionModals.a) obj;
                aVar2.setIsSelected(Boolean.valueOf(!aVar2.f19534a.booleanValue()));
                break;
            case 8:
                int i2 = c.t;
                ((c) obj).dismiss();
                break;
            case 9:
                C2535k2.a((C2535k2) obj, view);
                break;
            default:
                C2597o8.a((C2597o8) obj, view);
                break;
        }
    }
}
