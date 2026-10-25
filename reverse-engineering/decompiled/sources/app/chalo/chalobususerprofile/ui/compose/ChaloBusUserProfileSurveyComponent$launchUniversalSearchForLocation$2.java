package app.chalo.chalobususerprofile.ui.compose;

import app.chalo.constants.Source;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2", f = "ChaloBusUserProfileSurveyComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<String, Continuation<? super Unit>, Object> $collectResult;
    final /* synthetic */ UniversalPickerHeaderIcon $headerIcon;
    final /* synthetic */ String $headerTitle;
    final /* synthetic */ String $requestId;
    final /* synthetic */ String $searchOptionsJson;
    final /* synthetic */ String $searchSource;
    final /* synthetic */ String $stepIndicator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChaloBusUserProfileSurveyComponent this$0;

    /* JADX INFO: renamed from: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2$1", f = "ChaloBusUserProfileSurveyComponent.kt", l = {WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<String, Continuation<? super Unit>, Object> $collectResult;
        final /* synthetic */ String $requestId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function2 function2, String str, Continuation continuation) {
            super(2, continuation);
            this.$collectResult = function2;
            this.$requestId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$collectResult, this.$requestId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                Function2<String, Continuation<? super Unit>, Object> function2 = this.$collectResult;
                String str = this.$requestId;
                this.label = 1;
                if (function2.invoke(str, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2$2", f = "ChaloBusUserProfileSurveyComponent.kt", l = {416}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UniversalPickerHeaderIcon $headerIcon;
        final /* synthetic */ String $headerTitle;
        final /* synthetic */ String $requestId;
        final /* synthetic */ String $searchOptionsJson;
        final /* synthetic */ String $searchSource;
        final /* synthetic */ String $stepIndicator;
        Object L$0;
        int label;
        final /* synthetic */ ChaloBusUserProfileSurveyComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent, String str, String str2, String str3, String str4, String str5, UniversalPickerHeaderIcon universalPickerHeaderIcon, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloBusUserProfileSurveyComponent;
            this.$searchOptionsJson = str;
            this.$searchSource = str2;
            this.$requestId = str3;
            this.$headerTitle = str4;
            this.$stepIndicator = str5;
            this.$headerIcon = universalPickerHeaderIcon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$searchOptionsJson, this.$searchSource, this.$requestId, this.$headerTitle, this.$stepIndicator, this.$headerIcon, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChaloNavigationManager chaloNavigationManager;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent = this.this$0;
                ChaloNavigationManager chaloNavigationManager2 = chaloBusUserProfileSurveyComponent.n;
                this.L$0 = chaloNavigationManager2;
                this.label = 1;
                obj = chaloBusUserProfileSurveyComponent.o.b(StringEnum.ENTER_LOCATION, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloNavigationManager = chaloNavigationManager2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloNavigationManager = (ChaloNavigationManager) this.L$0;
                ResultKt.b(obj);
            }
            Source source = Source.SURVEY_SCREEN;
            ChaloNavigationManagerKt.e(chaloNavigationManager, new UniversalPickerArgs(this.$searchOptionsJson, (String) obj, this.$searchSource, source, (String) null, "ACTIVITY_RESULT", this.$requestId, (ChaloTransitMode) null, this.$headerTitle, this.$stepIndicator, this.$headerIcon, 144), null, 6);
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2(Function2 function2, String str, ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent, String str2, String str3, String str4, String str5, UniversalPickerHeaderIcon universalPickerHeaderIcon, Continuation continuation) {
        super(2, continuation);
        this.$collectResult = function2;
        this.$requestId = str;
        this.this$0 = chaloBusUserProfileSurveyComponent;
        this.$searchOptionsJson = str2;
        this.$searchSource = str3;
        this.$headerTitle = str4;
        this.$stepIndicator = str5;
        this.$headerIcon = universalPickerHeaderIcon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2 chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2 = new ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2(this.$collectResult, this.$requestId, this.this$0, this.$searchOptionsJson, this.$searchSource, this.$headerTitle, this.$stepIndicator, this.$headerIcon, continuation);
        chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2.L$0 = obj;
        return chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2 chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2 = (ChaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        chaloBusUserProfileSurveyComponent$launchUniversalSearchForLocation$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass1(this.$collectResult, this.$requestId, null), 3);
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.this$0, this.$searchOptionsJson, this.$searchSource, this.$requestId, this.$headerTitle, this.$stepIndicator, this.$headerIcon, null), 3);
        return Unit.f17538a;
    }
}
