package defpackage;

import app.chalo.busesaroundyou.BusesAroundYouComponent;
import app.chalo.busesaroundyou.BusesAroundYouDataState;
import app.chalo.busesaroundyou.BusesAroundYouIntent;
import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.crashlytics.CrashlyticsLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19198a;
    public final /* synthetic */ BusesAroundYouComponent b;

    public /* synthetic */ rd(BusesAroundYouComponent busesAroundYouComponent, int i) {
        this.f19198a = i;
        this.b = busesAroundYouComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19198a) {
            case 0:
                BusesAroundYouDataState it = (BusesAroundYouDataState) obj;
                Intrinsics.i(it, "it");
                return BusesAroundYouDataState.a(it, false, false, null, null, null, null, this.b.z.j(), 0L, false, 1791);
            case 1:
                ChaloMapCameraPositionStateData it2 = (ChaloMapCameraPositionStateData) obj;
                Intrinsics.i(it2, "it");
                this.b.K0(new BusesAroundYouIntent.MapCameraPositionStateChangedIntent(it2));
                return Unit.f17538a;
            default:
                CrashlyticsLog it3 = (CrashlyticsLog) obj;
                Intrinsics.i(it3, "it");
                this.b.K0(new BusesAroundYouIntent.OnCrashLoggingRequired(it3));
                return Unit.f17538a;
        }
    }
}
