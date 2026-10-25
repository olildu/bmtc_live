package app.chalo.onboarding.languageselection;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.language.data.Language;
import defpackage.vo1;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.languageselection.LanguageSelectionComponent$updateLocaleAndRefreshConfig$1", f = "LanguageSelectionComponent.kt", l = {253}, m = "invokeSuspend", v = 1)
final class LanguageSelectionComponent$updateLocaleAndRefreshConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LanguageSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectionComponent$updateLocaleAndRefreshConfig$1(LanguageSelectionComponent languageSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = languageSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageSelectionComponent$updateLocaleAndRefreshConfig$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageSelectionComponent$updateLocaleAndRefreshConfig$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            LanguageSelectionComponent languageSelectionComponent = this.this$0;
            this.label = 1;
            languageSelectionComponent.getClass();
            Language.Companion companion = Language.INSTANCE;
            StateFlow stateFlow = languageSelectionComponent.f;
            String str = ((LanguageSelectionDataState) stateFlow.getValue()).g.b;
            companion.getClass();
            Language languageA = Language.Companion.a(str);
            if (languageA == null) {
                languageA = Language.ENGLISH;
            }
            String locale = languageA.getLocale();
            AnalyticsContract analyticsContract = languageSelectionComponent.k;
            Source source = Source.LANGUAGE_SELECTION;
            AnalyticsContractImplKt.a(analyticsContract, "language screen continue clicked", source, ((LanguageSelectionDataState) stateFlow.getValue()).e.getSource(), vo1.s("locale", locale), 32);
            AnalyticsContractImplKt.b(languageSelectionComponent.k, "language changed", source, vo1.s("language", locale), false, 24);
            Object objD = languageSelectionComponent.o.d(languageA, this);
            if (objD != coroutineSingletons) {
                objD = unit;
            }
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        LanguageSelectionComponent languageSelectionComponent2 = this.this$0;
        Job job = languageSelectionComponent2.u;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        languageSelectionComponent2.u = BuildersKt.d(languageSelectionComponent2.j, null, null, new LanguageSelectionComponent$fetchRemoteConfigAndHandleResult$1(languageSelectionComponent2, true, null), 3);
        return unit;
    }
}
