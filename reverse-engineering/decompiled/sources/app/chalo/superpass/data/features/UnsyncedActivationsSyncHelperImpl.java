package app.chalo.superpass.data.features;

import app.chalo.helper.UnsyncedActivationsSyncHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/features/UnsyncedActivationsSyncHelperImpl;", "Lapp/chalo/helper/UnsyncedActivationsSyncHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnsyncedActivationsSyncHelperImpl implements UnsyncedActivationsSyncHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IDigitalTripReceiptFeature f9523a;
    public final IVisualValidationFeature b;

    public UnsyncedActivationsSyncHelperImpl(IDigitalTripReceiptFeature iDigitalTripReceiptFeature, IVisualValidationFeature iVisualValidationFeature) {
        this.f9523a = iDigitalTripReceiptFeature;
        this.b = iVisualValidationFeature;
    }

    @Override // app.chalo.helper.UnsyncedActivationsSyncHelper
    public final void a() {
        this.b.a();
    }

    @Override // app.chalo.helper.UnsyncedActivationsSyncHelper
    public final void b() {
        this.f9523a.a();
    }
}
