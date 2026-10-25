package app.chalo.livetracking.universalsearch.ui;

import app.chalo.livetracking.universalsearch.UniversalSearchHelper;
import app.chalo.recent.model.app.RecentStopAppModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$handleFavoriteStopItemClickedIntent$1", f = "UniversalPickerComponent.kt", l = {1201}, m = "invokeSuspend", v = 1)
final class UniversalPickerComponent$handleFavoriteStopItemClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RecentStopAppModel $favStop;
    int label;
    final /* synthetic */ UniversalPickerComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalPickerComponent$handleFavoriteStopItemClickedIntent$1(UniversalPickerComponent universalPickerComponent, RecentStopAppModel recentStopAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = universalPickerComponent;
        this.$favStop = recentStopAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalPickerComponent$handleFavoriteStopItemClickedIntent$1(this.this$0, this.$favStop, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalPickerComponent$handleFavoriteStopItemClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            UniversalSearchHelper universalSearchHelper = this.this$0.n;
            RecentStopAppModel recentStopAppModel = this.$favStop;
            String str = recentStopAppModel.e;
            String str2 = recentStopAppModel.f;
            String str3 = recentStopAppModel.k;
            if (str3 == null) {
                str3 = "";
            }
            this.label = 1;
            if (universalSearchHelper.b(str3, str, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
