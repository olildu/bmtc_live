package app.chalo.premiumbus.managers;

import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel$$serializer;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/managers/PremiumBusSharedRestoredState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/managers/PremiumBusSharedRestoredState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusSharedRestoredState$$serializer implements GeneratedSerializer<PremiumBusSharedRestoredState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusSharedRestoredState$$serializer f7277a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusSharedRestoredState$$serializer premiumBusSharedRestoredState$$serializer = new PremiumBusSharedRestoredState$$serializer();
        f7277a = premiumBusSharedRestoredState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.managers.PremiumBusSharedRestoredState", premiumBusSharedRestoredState$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("premiumBusPurchaseInfoState", false);
        pluginGeneratedSerialDescriptor.j("premiumBusProductPurchaseFlowType", false);
        pluginGeneratedSerialDescriptor.j("completeProductConfigSelected", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(PremiumBusPurchaseInfoState$$serializer.f7274a), BuiltinSerializersKt.c((KSerializer) PremiumBusSharedRestoredState.d[1].getValue()), BuiltinSerializersKt.c(ProductConfigCompleteDetailsListAppModel$$serializer.f8206a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        PremiumBusPurchaseInfoState premiumBusPurchaseInfoState;
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType;
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PremiumBusSharedRestoredState.d;
        PremiumBusPurchaseInfoState premiumBusPurchaseInfoState2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            premiumBusPurchaseInfoState = (PremiumBusPurchaseInfoState) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PremiumBusPurchaseInfoState$$serializer.f7274a, null);
            premiumBusProductPurchaseFlowType = (PremiumBusProductPurchaseFlowType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            productConfigCompleteDetailsListAppModel = (ProductConfigCompleteDetailsListAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ProductConfigCompleteDetailsListAppModel$$serializer.f8206a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType2 = null;
            ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    premiumBusPurchaseInfoState2 = (PremiumBusPurchaseInfoState) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PremiumBusPurchaseInfoState$$serializer.f7274a, premiumBusPurchaseInfoState2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    premiumBusProductPurchaseFlowType2 = (PremiumBusProductPurchaseFlowType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), premiumBusProductPurchaseFlowType2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    productConfigCompleteDetailsListAppModel2 = (ProductConfigCompleteDetailsListAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ProductConfigCompleteDetailsListAppModel$$serializer.f8206a, productConfigCompleteDetailsListAppModel2);
                    i2 |= 4;
                }
            }
            i = i2;
            premiumBusPurchaseInfoState = premiumBusPurchaseInfoState2;
            premiumBusProductPurchaseFlowType = premiumBusProductPurchaseFlowType2;
            productConfigCompleteDetailsListAppModel = productConfigCompleteDetailsListAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusSharedRestoredState(i, premiumBusPurchaseInfoState, premiumBusProductPurchaseFlowType, productConfigCompleteDetailsListAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusSharedRestoredState value = (PremiumBusSharedRestoredState) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PremiumBusSharedRestoredState.d;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, PremiumBusPurchaseInfoState$$serializer.f7274a, value.f7276a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, ProductConfigCompleteDetailsListAppModel$$serializer.f8206a, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
