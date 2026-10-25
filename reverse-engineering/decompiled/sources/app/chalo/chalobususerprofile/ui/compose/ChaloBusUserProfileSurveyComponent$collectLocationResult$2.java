package app.chalo.chalobususerprofile.ui.compose;

import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$collectLocationResult$2", f = "ChaloBusUserProfileSurveyComponent.kt", l = {448, 462}, m = "invokeSuspend", v = 1)
final class ChaloBusUserProfileSurveyComponent$collectLocationResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<RecentPlaceAppModel, Unit> $onLocationSelected;
    final /* synthetic */ String $requestId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChaloBusUserProfileSurveyComponent this$0;

    /* JADX INFO: renamed from: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$collectLocationResult$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$collectLocationResult$2$1", f = "ChaloBusUserProfileSurveyComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ChaloBusUserProfileSurveyComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloBusUserProfileSurveyComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            this.this$0.L0();
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$collectLocationResult$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$collectLocationResult$2$2", f = "ChaloBusUserProfileSurveyComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ChaloBusUserProfileSurveyComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloBusUserProfileSurveyComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            this.this$0.L0();
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusUserProfileSurveyComponent$collectLocationResult$2(ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusUserProfileSurveyComponent;
        this.$requestId = str;
        this.$onLocationSelected = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloBusUserProfileSurveyComponent$collectLocationResult$2 chaloBusUserProfileSurveyComponent$collectLocationResult$2 = new ChaloBusUserProfileSurveyComponent$collectLocationResult$2(this.this$0, this.$requestId, this.$onLocationSelected, continuation);
        chaloBusUserProfileSurveyComponent$collectLocationResult$2.L$0 = obj;
        return chaloBusUserProfileSurveyComponent$collectLocationResult$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusUserProfileSurveyComponent$collectLocationResult$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object objB;
        RecentPlaceAppModel recentPlaceAppModel;
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent = this.this$0;
            Flow flowB = chaloBusUserProfileSurveyComponent.q.b(this.$requestId);
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = chaloBusUserProfileSurveyComponent.b.v(flowB, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent2 = this.this$0;
        BuildersKt.d(chaloBusUserProfileSurveyComponent2.j, null, null, new AnonymousClass2(chaloBusUserProfileSurveyComponent2, null), 3);
        return unit;
        ResultStateData resultStateData = (ResultStateData) obj;
        CoroutineScopeKt.d(coroutineScope);
        if (resultStateData instanceof ResultStateData.Cancelled) {
            ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent3 = this.this$0;
            BuildersKt.d(chaloBusUserProfileSurveyComponent3.j, null, null, new AnonymousClass1(chaloBusUserProfileSurveyComponent3, null), 3);
            return unit;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((UniversalSearchResultState) ((ResultStateData.Success) resultStateData).f9039a).b;
        if (str != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, RecentPlaceAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            recentPlaceAppModel = (RecentPlaceAppModel) objB;
        } else {
            recentPlaceAppModel = null;
        }
        if (recentPlaceAppModel != null) {
            this.$onLocationSelected.invoke(recentPlaceAppModel);
            return unit;
        }
        ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent4 = this.this$0;
        KotlinToastManager kotlinToastManager2 = chaloBusUserProfileSurveyComponent4.p;
        this.L$0 = kotlinToastManager2;
        this.label = 2;
        obj = chaloBusUserProfileSurveyComponent4.o.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
        if (obj != coroutineSingletons) {
            kotlinToastManager = kotlinToastManager2;
            KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
            ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent5 = this.this$0;
            BuildersKt.d(chaloBusUserProfileSurveyComponent5.j, null, null, new AnonymousClass2(chaloBusUserProfileSurveyComponent5, null), 3);
            return unit;
        }
        return coroutineSingletons;
    }
}
