package defpackage;

import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.utils.CollectionUtilsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19084a;
    public final /* synthetic */ NearbyStopAndTripsUiModel b;

    public /* synthetic */ q11(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, int i) {
        this.f19084a = i;
        this.b = nearbyStopAndTripsUiModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19084a) {
            case 0:
                return Boolean.valueOf(this.b.h.size() > 2);
            case 1:
                return CollectionUtilsKt.b(2, this.b.h);
            case 2:
                return CollectionUtilsKt.b(2, this.b.h);
            default:
                return Boolean.valueOf(this.b.h.size() > 2);
        }
    }
}
