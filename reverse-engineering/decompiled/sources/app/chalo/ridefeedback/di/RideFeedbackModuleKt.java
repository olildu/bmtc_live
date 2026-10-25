package app.chalo.ridefeedback.di;

import app.chalo.ridefeedback.data.RideFeedbackRepositoryImpl;
import app.chalo.ridefeedback.data.remote.RideFeedbackRemoteDataSourceImpl;
import app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase;
import app.chalo.ridefeedback.domain.ClearRideFeedbackDataDuringLogoutUseCase;
import app.chalo.ridefeedback.domain.DismissRideFeedbackPromptUseCase;
import app.chalo.ridefeedback.domain.FetchRideFeedbackRemoteConfigListUseCase;
import app.chalo.ridefeedback.domain.GetPostRideFeedbackDataUseCase;
import app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase;
import app.chalo.ridefeedback.domain.RecordPendingFeedbackUseCase;
import app.chalo.ridefeedback.domain.RetryPendingRideFeedbackUseCase;
import app.chalo.ridefeedback.domain.RideFeedbackSubmissionGate;
import app.chalo.ridefeedback.domain.SubmitRideFeedbackUseCase;
import app.chalo.ridefeedback.domain.SyncPremiumBusPendingPrfEntriesUseCase;
import defpackage.fs0;
import defpackage.g11;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RideFeedbackModuleKt {
    public static final void a(Module module) {
        Intrinsics.i(module, "<this>");
        g11 g11Var = new g11(22);
        RideFeedbackModuleKt$rideFeedbackModule$$inlined$singleOf$1 rideFeedbackModuleKt$rideFeedbackModule$$inlined$singleOf$1 = new RideFeedbackModuleKt$rideFeedbackModule$$inlined$singleOf$1();
        Kind kind = Kind.Singleton;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(RideFeedbackRemoteDataSourceImpl.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, classReferenceA, null, rideFeedbackModuleKt$rideFeedbackModule$$inlined$singleOf$1, kind, emptyList), module)), g11Var);
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(RideFeedbackRepositoryImpl.class), null, new RideFeedbackModuleKt$rideFeedbackModule$$inlined$singleOf$2(), kind, emptyList), module)), new g11(23));
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(RideFeedbackSubmissionGate.class), null, new RideFeedbackModuleKt$rideFeedbackModule$$inlined$singleOf$default$1(), kind, emptyList), module)), null);
        RideFeedbackModuleKt$rideFeedbackModule$$inlined$factoryOf$default$1 rideFeedbackModuleKt$rideFeedbackModule$$inlined$factoryOf$default$1 = new RideFeedbackModuleKt$rideFeedbackModule$$inlined$factoryOf$default$1();
        Kind kind2 = Kind.Factory;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchRideFeedbackRemoteConfigListUseCase.class), null, rideFeedbackModuleKt$rideFeedbackModule$$inlined$factoryOf$default$1, kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetPostRideFeedbackDataUseCase.class), null, new RideFeedbackModuleKt$rideFeedbackModule$$inlined$factoryOf$default$2(), kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SubmitRideFeedbackUseCase.class), null, new RideFeedbackModuleKt$rideFeedbackModule$$inlined$factoryOf$default$3(), kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RecordPendingFeedbackUseCase.class), null, new RideFeedbackModuleKt$rideFeedbackModule$$inlined$factoryOf$default$4(), kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RetryPendingRideFeedbackUseCase.class), null, new RideFeedbackModuleKt$rideFeedbackModule$$inlined$factoryOf$default$5(), kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(BackfillPendingPremiumBusPrfUseCase.class), null, new RideFeedbackModuleKt$rideFeedbackModule$$inlined$factoryOf$default$6(), kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(SyncPremiumBusPendingPrfEntriesUseCase.class), null, new RideFeedbackModuleKt$rideFeedbackModule$$inlined$singleOf$default$2(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(DismissRideFeedbackPromptUseCase.class), null, new RideFeedbackModuleKt$rideFeedbackModule$$inlined$factoryOf$default$7(), kind2, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ObservePendingRideFeedbackPromptsUseCase.class), null, new RideFeedbackModuleKt$rideFeedbackModule$$inlined$factoryOf$default$8(), kind2, emptyList), module)), null);
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ClearRideFeedbackDataDuringLogoutUseCase.class), null, new fs0(17), kind2, emptyList), module));
    }
}
