package app.chalo.compose.components.chalomap;

import app.chalo.uistate.components.map.ChaloMapUIEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ChaloMap_androidKt$ChaloMap$1$1$1 extends FunctionReferenceImpl implements Function1<MapCameraUpdate, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MapCameraUpdate p0 = (MapCameraUpdate) obj;
        Intrinsics.i(p0, "p0");
        ((ChaloMapUIEventHandler) this.receiver).a(p0);
        return Unit.f17538a;
    }
}
