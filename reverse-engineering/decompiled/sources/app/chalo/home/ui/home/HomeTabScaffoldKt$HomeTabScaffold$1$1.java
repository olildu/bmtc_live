package app.chalo.home.ui.home;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.home.HomeTabScaffoldKt$HomeTabScaffold$1$1", f = "HomeTabScaffold.kt", l = {115, 128, 131}, m = "invokeSuspend", v = 1)
final class HomeTabScaffoldKt$HomeTabScaffold$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeScreenBottomSheetType $bottomSheetType;
    final /* synthetic */ HomeTabCallbacks $callbacks;
    final /* synthetic */ boolean $isTabVisible;
    final /* synthetic */ MutableState<Boolean> $lastSheetVisibility$delegate;
    final /* synthetic */ SheetState $modalBottomSheetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTabScaffoldKt$HomeTabScaffold$1$1(boolean z, HomeTabCallbacks homeTabCallbacks, SheetState sheetState, HomeScreenBottomSheetType homeScreenBottomSheetType, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$isTabVisible = z;
        this.$callbacks = homeTabCallbacks;
        this.$modalBottomSheetState = sheetState;
        this.$bottomSheetType = homeScreenBottomSheetType;
        this.$lastSheetVisibility$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeTabScaffoldKt$HomeTabScaffold$1$1 homeTabScaffoldKt$HomeTabScaffold$1$1 = new HomeTabScaffoldKt$HomeTabScaffold$1$1(this.$isTabVisible, this.$callbacks, this.$modalBottomSheetState, this.$bottomSheetType, this.$lastSheetVisibility$delegate, continuation);
        homeTabScaffoldKt$HomeTabScaffold$1$1.L$0 = obj;
        return homeTabScaffoldKt$HomeTabScaffold$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeTabScaffoldKt$HomeTabScaffold$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00be A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        try {
            try {
                try {
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.b(obj);
                            return unit;
                        }
                        if (i == 2) {
                            ResultKt.b(obj);
                            return unit;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                        return unit;
                    }
                    ResultKt.b(obj);
                    if (!this.$isTabVisible) {
                        if (this.$lastSheetVisibility$delegate.getValue().booleanValue()) {
                            Function1 function1 = this.$callbacks.f3578a;
                            Boolean bool = Boolean.FALSE;
                            function1.invoke(bool);
                            this.$lastSheetVisibility$delegate.setValue(bool);
                        }
                        if (this.$modalBottomSheetState.isVisible()) {
                            SheetState sheetState = this.$modalBottomSheetState;
                            this.label = 1;
                            if (sheetState.hide(this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return unit;
                    }
                    boolean z = this.$bottomSheetType != null;
                    if (z != this.$lastSheetVisibility$delegate.getValue().booleanValue()) {
                        this.$callbacks.f3578a.invoke(Boolean.valueOf(z));
                        this.$lastSheetVisibility$delegate.setValue(Boolean.valueOf(z));
                    }
                    if (z) {
                        if (!this.$modalBottomSheetState.isVisible()) {
                            SheetState sheetState2 = this.$modalBottomSheetState;
                            this.label = 2;
                            if (sheetState2.show(this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return unit;
                    }
                    if (this.$modalBottomSheetState.isVisible()) {
                        SheetState sheetState3 = this.$modalBottomSheetState;
                        this.label = 3;
                        if (sheetState3.hide(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return unit;
                } catch (Throwable th) {
                    ResultKt.a(th);
                }
            } catch (Throwable th2) {
                ResultKt.a(th2);
            }
        } catch (Throwable th3) {
            ResultKt.a(th3);
            return unit;
        }
    }
}
