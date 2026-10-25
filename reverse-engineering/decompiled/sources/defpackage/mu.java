package defpackage;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt;
import androidx.compose.material3.DatePickerKt;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutDataState;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mu implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18429a;
    public final /* synthetic */ int b;

    public /* synthetic */ mu(int i, int i2) {
        this.f18429a = i2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18429a) {
            case 0:
                CustomUrlCheckoutDataState it = (CustomUrlCheckoutDataState) obj;
                Intrinsics.i(it, "it");
                return CustomUrlCheckoutDataState.a(it, false, null, this.b, false, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION);
            case 1:
                return Integer.valueOf(DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16(this.b, ((Integer) obj).intValue()));
            case 2:
                return Integer.valueOf(DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$17(this.b, ((Integer) obj).intValue()));
            case 3:
                return Integer.valueOf(LazyStaggeredGridMeasureResultKt.findVisibleItem$lambda$0(this.b, (LazyStaggeredGridItemInfo) obj));
            case 4:
                PremiumBusSeatSelectionDataState it2 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusSeatSelectionDataState.a(it2, false, null, null, Integer.valueOf(this.b), null, false, null, null, false, null, null, null, null, 61407);
            case 5:
                PremiumBusSeatSelectionDataState it3 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it3, "it");
                return PremiumBusSeatSelectionDataState.a(it3, false, null, null, null, null, false, null, null, false, null, null, null, Integer.valueOf(this.b - 1), 32767);
            default:
                PremiumBusSeatSelectionDataState it4 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it4, "it");
                return PremiumBusSeatSelectionDataState.a(it4, false, null, null, null, null, false, null, null, false, null, null, null, Integer.valueOf(this.b), 32767);
        }
    }
}
