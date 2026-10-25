package app.chalo.compose.components.chalomap;

import defpackage.ji;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIEventHandler;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChaloMapMarkerUIEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f1869a = Companion.f1870a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIEventHandler$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f1870a = new Companion();
        public static final Lazy b = LazyKt.b(new ji(25));

        /* JADX WARN: Type inference failed for: r0v1, types: [app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler$Companion$fromLambda$1] */
        public static ChaloMapMarkerUIEventHandler$Companion$fromLambda$1 a(final Function0 onMarkerClick, final Function0 function0, final Function0 function1) {
            Intrinsics.i(onMarkerClick, "onMarkerClick");
            return new ChaloMapMarkerUIEventHandler() { // from class: app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler$Companion$fromLambda$1
                @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler
                public final boolean a() {
                    return ((Boolean) onMarkerClick.invoke()).booleanValue();
                }

                @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler
                public final void b() {
                    function0.invoke();
                }

                @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler
                public final void c() {
                    function1.invoke();
                }
            };
        }
    }

    boolean a();

    void b();

    void c();
}
