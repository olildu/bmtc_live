package app.chalo.onboarding.languageselection;

import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import defpackage.t60;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.languageselection.LanguageSelectionComponent$handleLanguageInstallFailure$1", f = "LanguageSelectionComponent.kt", l = {218}, m = "invokeSuspend", v = 1)
final class LanguageSelectionComponent$handleLanguageInstallFailure$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LanguageSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectionComponent$handleLanguageInstallFailure$1(LanguageSelectionComponent languageSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = languageSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageSelectionComponent$handleLanguageInstallFailure$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageSelectionComponent$handleLanguageInstallFailure$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Language language;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Language language2 = (Language) this.this$0.l.getE().getValue();
            if (language2 == null) {
                language2 = Language.ENGLISH;
            }
            LanguageFeature languageFeature = this.this$0.l;
            this.L$0 = language2;
            this.label = 1;
            Object objE = languageFeature.e(language2, this);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            language = language2;
            obj = objE;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            language = (Language) this.L$0;
            ResultKt.b(obj);
        }
        this.this$0.E0(new t60(14, (String) obj, language));
        LanguageSelectionComponent languageSelectionComponent = this.this$0;
        BuildersKt.d(languageSelectionComponent.j, null, null, new LanguageSelectionComponent$showLanguageChangeFailureSnakeBar$1(languageSelectionComponent, null), 3);
        return Unit.f17538a;
    }
}
