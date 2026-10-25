package defpackage;

import app.chalo.metro.ui.landing.MetroLandingScreenDataState;
import app.chalo.metro.ui.landing.PickStopRequestType;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenDataState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18401a;
    public final /* synthetic */ PickStopRequestType b;

    public /* synthetic */ mi0(PickStopRequestType pickStopRequestType, int i) {
        this.f18401a = i;
        this.b = pickStopRequestType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18401a) {
            case 0:
                MetroLandingScreenDataState it = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it, "it");
                return MetroLandingScreenDataState.a(it, false, null, null, null, this.b, null, null, null, null, null, null, null, null, 8175);
            default:
                StopBasedMetroLandingScreenDataState it2 = (StopBasedMetroLandingScreenDataState) obj;
                Intrinsics.i(it2, "it");
                return StopBasedMetroLandingScreenDataState.a(it2, null, false, null, null, null, this.b, null, null, null, null, null, null, null, 8159);
        }
    }
}
