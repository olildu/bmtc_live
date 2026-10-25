package app.chalo.uistate.components.map;

import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.location.LatLng;
import defpackage.bj;
import defpackage.ji;
import defpackage.rd;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/uistate/components/map/ChaloMapUIEventHandler;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChaloMapUIEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f9960a = Companion.f9961a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/map/ChaloMapUIEventHandler$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f9961a = new Companion();
        public static final Lazy b = LazyKt.b(new ji(26));

        /* JADX WARN: Type inference failed for: r1v1, types: [app.chalo.uistate.components.map.ChaloMapUIEventHandler$Companion$fromLambda$4] */
        public static ChaloMapUIEventHandler$Companion$fromLambda$4 a(Companion companion, final Function1 function1, final Function0 function0, final rd rdVar, int i) {
            if ((i & 4) != 0) {
                rdVar = null;
            }
            final bj bjVar = new bj(21);
            companion.getClass();
            return new ChaloMapUIEventHandler() { // from class: app.chalo.uistate.components.map.ChaloMapUIEventHandler$Companion$fromLambda$4
                @Override // app.chalo.uistate.components.map.ChaloMapUIEventHandler
                public final void a(MapCameraUpdate data) {
                    Intrinsics.i(data, "data");
                    function1.invoke(data);
                }

                @Override // app.chalo.uistate.components.map.ChaloMapUIEventHandler
                public final void b() {
                    function0.invoke();
                }

                @Override // app.chalo.uistate.components.map.ChaloMapUIEventHandler
                public final void c(ChaloMapCameraPositionStateData data) {
                    Intrinsics.i(data, "data");
                    Function1 function2 = rdVar;
                    if (function2 != null) {
                        function2.invoke(data);
                    }
                }

                @Override // app.chalo.uistate.components.map.ChaloMapUIEventHandler
                public final void d(LatLng latLng) {
                    Intrinsics.i(latLng, "latLng");
                    bjVar.invoke(latLng);
                }
            };
        }
    }

    void a(MapCameraUpdate mapCameraUpdate);

    void b();

    void c(ChaloMapCameraPositionStateData chaloMapCameraPositionStateData);

    void d(LatLng latLng);
}
