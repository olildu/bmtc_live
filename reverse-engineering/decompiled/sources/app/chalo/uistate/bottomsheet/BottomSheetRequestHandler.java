package app.chalo.uistate.bottomsheet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/uistate/bottomsheet/BottomSheetRequestHandler;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BottomSheetRequestHandler {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/bottomsheet/BottomSheetRequestHandler$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetRequestHandler$Companion$NO_OP$1 f9902a = new BottomSheetRequestHandler$Companion$NO_OP$1();

        /* JADX WARN: Type inference failed for: r0v1, types: [app.chalo.uistate.bottomsheet.BottomSheetRequestHandler$Companion$fromLambda$2] */
        public static BottomSheetRequestHandler$Companion$fromLambda$2 a(final Function0 dismissRequest) {
            Intrinsics.i(dismissRequest, "dismissRequest");
            return new BottomSheetRequestHandler() { // from class: app.chalo.uistate.bottomsheet.BottomSheetRequestHandler$Companion$fromLambda$2
                @Override // app.chalo.uistate.bottomsheet.BottomSheetRequestHandler
                public final void a() {
                    dismissRequest.invoke();
                }
            };
        }
    }

    void a();
}
