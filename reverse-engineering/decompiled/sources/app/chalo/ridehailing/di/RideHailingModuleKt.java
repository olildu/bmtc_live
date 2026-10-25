package app.chalo.ridehailing.di;

import app.chalo.ridehailing.common.RideHailingUIStateCommonFactory;
import app.chalo.ridehailing.data.RideHailingRepositoryImpl;
import app.chalo.ridehailing.data.local.RideHailingLocalDataSourceImpl;
import app.chalo.ridehailing.data.remote.RideHailingRemoteDataSourceImpl;
import app.chalo.ridehailing.domain.SubmitRideHailingBookingFeedbackUseCase;
import app.chalo.ridehailing.feedback.AutoRideFeedbackDelegate;
import app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate;
import app.chalo.ridehailing.feedback.DefaultRideFeedbackUIStateFactory;
import app.chalo.ridehailing.feedback.RideFeedbackCommonUIStateFactory;
import app.chalo.ridehailing.feedback.RideFeedbackUIStateFactory;
import app.chalo.ridehailing.feedback.RideFeedbackUserPropertiesFactory;
import app.chalo.ridehailing.feedback.RideUserFeedbackComponent;
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
public final class RideHailingModuleKt {
    public static final void a(Module module) {
        Intrinsics.i(module, "<this>");
        RideHailingModuleKt$rideHailingModule$$inlined$factoryOf$default$1 rideHailingModuleKt$rideHailingModule$$inlined$factoryOf$default$1 = new RideHailingModuleKt$rideHailingModule$$inlined$factoryOf$default$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(RideHailingUIStateCommonFactory.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, rideHailingModuleKt$rideHailingModule$$inlined$factoryOf$default$1, kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RideFeedbackCommonUIStateFactory.class), null, new RideHailingModuleKt$rideHailingModule$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RideFeedbackUserPropertiesFactory.class), null, new RideHailingModuleKt$rideHailingModule$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RideFeedbackUIStateFactory.class), null, new RideHailingModuleKt$rideHailingModule$$inlined$factoryOf$default$4(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(DefaultRideFeedbackUIStateFactory.class), null, new RideHailingModuleKt$rideHailingModule$$inlined$factoryOf$default$5(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SubmitRideHailingBookingFeedbackUseCase.class), null, new RideHailingModuleKt$rideHailingModule$$inlined$factoryOf$default$6(), kind, emptyList), module)), null);
        g11 g11Var = new g11(25);
        RideHailingModuleKt$rideHailingModule$$inlined$singleOf$1 rideHailingModuleKt$rideHailingModule$$inlined$singleOf$1 = new RideHailingModuleKt$rideHailingModule$$inlined$singleOf$1();
        Kind kind2 = Kind.Singleton;
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(RideHailingRemoteDataSourceImpl.class), null, rideHailingModuleKt$rideHailingModule$$inlined$singleOf$1, kind2, emptyList), module)), g11Var);
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(RideHailingLocalDataSourceImpl.class), null, new RideHailingModuleKt$rideHailingModule$$inlined$singleOf$2(), kind2, emptyList), module)), new g11(26));
        OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(RideHailingRepositoryImpl.class), null, new RideHailingModuleKt$rideHailingModule$$inlined$singleOf$3(), kind2, emptyList), module)), new g11(27));
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(AutoRideFeedbackDelegate.class), null, new fs0(18), kind, emptyList), module));
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(DefaultRideFeedbackDelegate.class), null, new fs0(19), kind, emptyList), module));
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RideUserFeedbackComponent.class), null, new fs0(20), kind, emptyList), module));
    }
}
