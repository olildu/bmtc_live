package app.chalo.metro.di;

import app.chalo.metro.validation.MetroTicketProductValidationConfig;
import app.chalo.metro.validation.MetroTicketProductValidationUIManager;
import app.chalo.metro.validation.MetroTicketReceiptManager;
import app.chalo.metro.validation.MetroTicketUserDetailsForProducts;
import app.chalo.metro.validation.MetroTicketValidationAnalyticManager;
import app.chalo.metro.validation.MetroTicketValidationData;
import app.chalo.metro.validation.MetroTicketValidationNavigationManager;
import app.chalo.metro.validation.MetroTicketValidationReportProblemManager;
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
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MetroValidationModuleKt {
    public static final void a(Module module) {
        Intrinsics.i(module, "<this>");
        MetroValidationModuleKt$metroValidationDependencies$$inlined$factoryOf$default$1 metroValidationModuleKt$metroValidationDependencies$$inlined$factoryOf$default$1 = new MetroValidationModuleKt$metroValidationDependencies$$inlined$factoryOf$default$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(MetroTicketValidationData.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, metroValidationModuleKt$metroValidationDependencies$$inlined$factoryOf$default$1, kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MetroTicketUserDetailsForProducts.class), null, new MetroValidationModuleKt$metroValidationDependencies$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MetroTicketValidationReportProblemManager.class), null, new MetroValidationModuleKt$metroValidationDependencies$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MetroTicketProductValidationUIManager.class), null, new MetroValidationModuleKt$metroValidationDependencies$$inlined$factoryOf$default$4(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MetroTicketValidationNavigationManager.class), null, new MetroValidationModuleKt$metroValidationDependencies$$inlined$factoryOf$default$5(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MetroTicketReceiptManager.class), null, new MetroValidationModuleKt$metroValidationDependencies$$inlined$factoryOf$default$6(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MetroTicketValidationAnalyticManager.class), null, new MetroValidationModuleKt$metroValidationDependencies$$inlined$factoryOf$default$7(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MetroTicketProductValidationConfig.class), null, new MetroValidationModuleKt$metroValidationDependencies$$inlined$factoryOf$default$8(), kind, emptyList), module)), null);
    }
}
