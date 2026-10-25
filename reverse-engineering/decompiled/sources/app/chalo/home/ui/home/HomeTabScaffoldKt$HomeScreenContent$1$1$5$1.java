package app.chalo.home.ui.home;

import androidx.compose.runtime.MutableState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.home.HomeTabScaffoldKt$HomeScreenContent$1$1$5$1", f = "HomeTabScaffold.kt", l = {}, m = "invokeSuspend", v = 1)
final class HomeTabScaffoldKt$HomeScreenContent$1$1$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<HomeUnifiedAdUiState> $adUiState$delegate;
    final /* synthetic */ String $sectionId;
    final /* synthetic */ HomeUnifiedAdUiStateTracker $unifiedAdUiStateTracker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTabScaffoldKt$HomeScreenContent$1$1$5$1(HomeUnifiedAdUiStateTracker homeUnifiedAdUiStateTracker, String str, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$unifiedAdUiStateTracker = homeUnifiedAdUiStateTracker;
        this.$sectionId = str;
        this.$adUiState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeTabScaffoldKt$HomeScreenContent$1$1$5$1(this.$unifiedAdUiStateTracker, this.$sectionId, this.$adUiState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        HomeTabScaffoldKt$HomeScreenContent$1$1$5$1 homeTabScaffoldKt$HomeScreenContent$1$1$5$1 = (HomeTabScaffoldKt$HomeScreenContent$1$1$5$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        homeTabScaffoldKt$HomeScreenContent$1$1$5$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeUnifiedAdUiState homeUnifiedAdUiState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        MutableState<HomeUnifiedAdUiState> mutableState = this.$adUiState$delegate;
        HomeUnifiedAdUiStateTracker homeUnifiedAdUiStateTracker = this.$unifiedAdUiStateTracker;
        String sectionId = this.$sectionId;
        Map map = homeUnifiedAdUiStateTracker.f3583a;
        Intrinsics.i(sectionId, "sectionId");
        if (Intrinsics.d(homeUnifiedAdUiStateTracker.b, sectionId)) {
            homeUnifiedAdUiState = homeUnifiedAdUiStateTracker.c;
        } else {
            String str = homeUnifiedAdUiStateTracker.b;
            if (str != null) {
            }
            homeUnifiedAdUiStateTracker.b = sectionId;
            homeUnifiedAdUiStateTracker.c = new HomeUnifiedAdUiState(0, 0, false, false);
            map.put(sectionId, Boolean.FALSE);
            homeUnifiedAdUiState = homeUnifiedAdUiStateTracker.c;
        }
        mutableState.setValue(homeUnifiedAdUiState);
        return Unit.f17538a;
    }
}
