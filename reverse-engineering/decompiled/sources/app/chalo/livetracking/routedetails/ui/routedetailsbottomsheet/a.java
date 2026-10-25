package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.animation.core.TweenSpec;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4460a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ CoroutineScope c;

    public /* synthetic */ a(Object obj, CoroutineScope coroutineScope, int i) {
        this.f4460a = i;
        this.b = obj;
        this.c = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f4460a;
        CoroutineScope coroutineScope = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) obj;
                float f = BottomSheetScaffoldKt.f4445a;
                if (((Boolean) bottomSheetScaffoldState.f4447a.b.invoke(BottomSheetValue.Expanded)).booleanValue()) {
                    BuildersKt.d(coroutineScope, null, null, new BottomSheetScaffoldKt$SlidingUpPanelBottomSheetScaffold$1$swipeable$1$1$1$1(bottomSheetScaffoldState, null), 3);
                }
                break;
            case 1:
                BottomSheetScaffoldState bottomSheetScaffoldState2 = (BottomSheetScaffoldState) obj;
                float f2 = BottomSheetScaffoldKt.f4445a;
                if (((Boolean) bottomSheetScaffoldState2.f4447a.b.invoke(BottomSheetValue.Collapsed)).booleanValue()) {
                    BuildersKt.d(coroutineScope, null, null, new BottomSheetScaffoldKt$SlidingUpPanelBottomSheetScaffold$1$swipeable$1$1$2$1(bottomSheetScaffoldState2, null), 3);
                }
                break;
            default:
                BottomDrawerState bottomDrawerState = (BottomDrawerState) obj;
                TweenSpec tweenSpec = DrawerKt.f4449a;
                if (((Boolean) bottomDrawerState.b.invoke(BottomDrawerValue.Closed)).booleanValue()) {
                    BuildersKt.d(coroutineScope, null, null, new DrawerKt$BottomDrawer$1$1$4$1$1$1(bottomDrawerState, null), 3);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
