package defpackage;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.homescreen.data.model.app.BottomNavTabAppModel;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CopyableThreadContextElement;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class yt implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20141a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yt(Ref.ObjectRef objectRef, boolean z) {
        this.f20141a = 0;
        this.c = objectRef;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [T, kotlin.coroutines.CoroutineContext] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20141a) {
            case 0:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.c;
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof CopyableThreadContextElement)) {
                    return coroutineContext.plus(element);
                }
                if (((CoroutineContext) objectRef.element).get(element.getKey()) == null) {
                    return coroutineContext.plus(this.b ? ((CopyableThreadContextElement) element).x() : (CopyableThreadContextElement) element);
                }
                objectRef.element = ((CoroutineContext) objectRef.element).minusKey(element.getKey());
                return coroutineContext.plus(((CopyableThreadContextElement) element).L0());
            case 1:
                BottomNavTabAppModel bottomNavTabAppModel = ((NavigationTabAppModel) this.c).f3761a;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2090447796, iIntValue, -1, "app.chalo.home.ui.base.AppBottomNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreenMainDecompose.kt:565)");
                    }
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(this.b ? bottomNavTabAppModel.e : bottomNavTabAppModel.f, composer, 0), (String) null, SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer, 0).l), 0L, composer, Painter.$stable | 48, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            default:
                RouteDetailsViewTypeUIState.MainScreen mainScreen = (RouteDetailsViewTypeUIState.MainScreen) this.c;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(790269925, iIntValue2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreen.<anonymous>.<anonymous>.<anonymous> (RouteDetailsStopAndMapScreen.kt:170)");
                    }
                    AnimatedVisibilityKt.AnimatedVisibility(this.b, (Modifier) null, EnterExitTransitionKt.m86scaleInL8ZKhE$default(null, 0.0f, 0L, 7, null), EnterExitTransitionKt.m88scaleOutL8ZKhE$default(null, 0.0f, 0L, 7, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1968627389, true, new t31(mainScreen, 1), composer2, 54), composer2, 200064, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.f17538a;
        }
    }

    public /* synthetic */ yt(boolean z, Object obj, int i) {
        this.f20141a = i;
        this.b = z;
        this.c = obj;
    }
}
