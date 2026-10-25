package app.chalo.electricitybill.di;

import app.chalo.electricitybill.data.mapper.NetworkResponseToEBillOrderCreationExceptionMapper;
import app.chalo.electricitybill.data.mapper.NetworkResponseToElectricityBillConsumerNotFoundExceptionMapper;
import app.chalo.electricitybill.data.mapper.NetworkResponseToElectricityBillGetPaymentHistoryExceptionMapper;
import app.chalo.electricitybill.data.remote.ElectricityBillRemoteDataSourceImpl;
import app.chalo.electricitybill.data.repository.ElectricityBillRepositoryImpl;
import app.chalo.electricitybill.domain.EBillAmountUseCase;
import app.chalo.electricitybill.domain.EBillCreateOrderUseCase;
import app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase;
import app.chalo.electricitybill.domain.EBillFetchUseCase;
import app.chalo.electricitybill.ui.ebillamount.EbillAmountComponent;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchComponent;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent;
import app.chalo.electricitybill.ui.ebillpaymentsuccess.EBillPaymentSuccessComponent;
import app.chalo.electricitybill.ui.invoice.EBillPaymentInvoiceComponent;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityBillPaymentHistoryComponent;
import defpackage.b00;
import defpackage.i71;
import defpackage.tr;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ElectricityBillModuleKt {
    public static final void a(Module module) {
        Intrinsics.i(module, "<this>");
        ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$1 electricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$1 = new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$1();
        Kind kind = Kind.Factory;
        EmptyList emptyList = EmptyList.f17557a;
        ClassReference classReferenceA = Reflection.a(NetworkResponseToEBillOrderCreationExceptionMapper.class);
        StringQualifier stringQualifier = ScopeRegistry.e;
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, electricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$1, kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(NetworkResponseToElectricityBillConsumerNotFoundExceptionMapper.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(NetworkResponseToElectricityBillGetPaymentHistoryExceptionMapper.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ElectricityBillRepositoryImpl.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$1(), kind, emptyList), module)), new b00(16));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ElectricityBillRemoteDataSourceImpl.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$2(), kind, emptyList), module)), new b00(17));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(EBillAmountUseCase.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$4(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(EBillCreateOrderUseCase.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$5(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(EBillFetchUseCase.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$6(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(EBillFetchPaymentHistoryUseCase.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$7(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(EBillFetchComponent.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$8(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(EBillPaymentInvoiceComponent.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$9(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ElectricityBillPaymentHistoryComponent.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$10(), kind, emptyList), module)), null);
        new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(EbillAmountComponent.class), null, new tr(16), kind, emptyList), module));
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(EBillPaymentConfirmationComponent.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$11(), kind, emptyList), module)), null);
        OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(EBillPaymentSuccessComponent.class), null, new ElectricityBillModuleKt$getElectricityBillModule$$inlined$factoryOf$default$12(), kind, emptyList), module)), null);
    }
}
