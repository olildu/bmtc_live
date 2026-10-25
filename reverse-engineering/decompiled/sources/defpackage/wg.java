package defpackage;

import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.chalobus.RidePreferenceBannerState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19925a;
    public final /* synthetic */ RidePreferenceBannerState.SaveRideEligible b;

    public /* synthetic */ wg(RidePreferenceBannerState.SaveRideEligible saveRideEligible, int i) {
        this.f19925a = i;
        this.b = saveRideEligible;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ChaloBusViewState it = (ChaloBusViewState) obj;
        switch (this.f19925a) {
            case 0:
                Intrinsics.i(it, "it");
                RidePreferenceBannerState.SaveRideEligible saveRideEligible = this.b;
                return ChaloBusViewState.a(it, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, new RidePreferenceBannerState.SaveRideEligible(false, saveRideEligible.b, saveRideEligible.c, saveRideEligible.d, saveRideEligible.e), null, null, null, 251658237);
            case 1:
                Intrinsics.i(it, "it");
                RidePreferenceBannerState.SaveRideEligible saveRideEligible2 = this.b;
                return ChaloBusViewState.a(it, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, new RidePreferenceBannerState.SaveRideEligible(false, saveRideEligible2.b, saveRideEligible2.c, saveRideEligible2.d, saveRideEligible2.e), null, null, null, 117440509);
            default:
                Intrinsics.i(it, "it");
                RidePreferenceBannerState.SaveRideEligible saveRideEligible3 = this.b;
                return ChaloBusViewState.a(it, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, new RidePreferenceBannerState.SaveRideEligible(true, saveRideEligible3.b, saveRideEligible3.c, saveRideEligible3.d, saveRideEligible3.e), null, null, null, 251658237);
        }
    }
}
