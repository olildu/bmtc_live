package app.chalo.scenes;

import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.SceneArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloNavigationManagerKt {
    public static final void a(ChaloNavigationManager chaloNavigationManager, List stack) {
        Intrinsics.i(chaloNavigationManager, "<this>");
        Intrinsics.i(stack, "stack");
        chaloNavigationManager.b(new ChaloNavigationRequest.BuildStack(stack));
    }

    public static final void b(ChaloNavigationManager chaloNavigationManager, SceneArgs... sceneArgsArr) {
        Intrinsics.i(chaloNavigationManager, "<this>");
        a(chaloNavigationManager, ArraysKt.e(sceneArgsArr));
    }

    public static void c(ChaloNavigationManager chaloNavigationManager) {
        Intrinsics.i(chaloNavigationManager, "<this>");
        chaloNavigationManager.b(new ChaloNavigationRequest.GoBack(null));
    }

    public static final void d(ChaloNavigationManager chaloNavigationManager, SceneArgs args, ChaloNavOptions chaloNavOptions, String str) {
        Intrinsics.i(chaloNavigationManager, "<this>");
        Intrinsics.i(args, "args");
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(args, chaloNavOptions, str));
    }

    public static /* synthetic */ void e(ChaloNavigationManager chaloNavigationManager, SceneArgs sceneArgs, ChaloNavOptions chaloNavOptions, int i) {
        if ((i & 2) != 0) {
            chaloNavOptions = null;
        }
        d(chaloNavigationManager, sceneArgs, chaloNavOptions, (i & 4) == 0 ? "ValidationTag" : null);
    }

    public static final void f(ChaloNavigationManager chaloNavigationManager, HomeArgs homeArgs) {
        Intrinsics.i(chaloNavigationManager, "<this>");
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(homeArgs, new ChaloNavOptions(new PopUpToConfig.ClearAll(), 2), null, 4));
    }
}
