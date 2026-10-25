package app.chalo.productbooking.common;

import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel$$serializer;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel$$serializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/ProductBookingFlowType.PremiumBusProduct.SelectSlot.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$SelectSlot;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ProductBookingFlowType$PremiumBusProduct$SelectSlot$$serializer implements GeneratedSerializer<ProductBookingFlowType.PremiumBusProduct.SelectSlot> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductBookingFlowType$PremiumBusProduct$SelectSlot$$serializer f8094a;
    private static final SerialDescriptor descriptor;

    static {
        ProductBookingFlowType$PremiumBusProduct$SelectSlot$$serializer productBookingFlowType$PremiumBusProduct$SelectSlot$$serializer = new ProductBookingFlowType$PremiumBusProduct$SelectSlot$$serializer();
        f8094a = productBookingFlowType$PremiumBusProduct$SelectSlot$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.ProductBookingFlowType.PremiumBusProduct.SelectSlot", productBookingFlowType$PremiumBusProduct$SelectSlot$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("originDestinationAppModel", false);
        pluginGeneratedSerialDescriptor.j("fromStopOrPlaceSelected", false);
        pluginGeneratedSerialDescriptor.j("toStopOrPlaceSelected", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
        return new KSerializer[]{PBOriginDestinationAppModel$$serializer.f7092a, pBStopPlaceSelectedAppModel$$serializer, pBStopPlaceSelectedAppModel$$serializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        PBOriginDestinationAppModel pBOriginDestinationAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        PBOriginDestinationAppModel pBOriginDestinationAppModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            pBOriginDestinationAppModel = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PBOriginDestinationAppModel$$serializer.f7092a, null);
            PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
            pBStopPlaceSelectedAppModel = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, pBStopPlaceSelectedAppModel$$serializer, null);
            pBStopPlaceSelectedAppModel2 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, pBStopPlaceSelectedAppModel$$serializer, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = null;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PBOriginDestinationAppModel$$serializer.f7092a, pBOriginDestinationAppModel2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    pBStopPlaceSelectedAppModel3 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    pBStopPlaceSelectedAppModel4 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel4);
                    i2 |= 4;
                }
            }
            i = i2;
            pBOriginDestinationAppModel = pBOriginDestinationAppModel2;
            pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel3;
            pBStopPlaceSelectedAppModel2 = pBStopPlaceSelectedAppModel4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductBookingFlowType.PremiumBusProduct.SelectSlot(i, pBOriginDestinationAppModel, pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProductBookingFlowType.PremiumBusProduct.SelectSlot value = (ProductBookingFlowType.PremiumBusProduct.SelectSlot) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ProductBookingFlowType.PremiumBusProduct.SelectSlot.Companion companion = ProductBookingFlowType.PremiumBusProduct.SelectSlot.INSTANCE;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, PBOriginDestinationAppModel$$serializer.f7092a, value.c);
        PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, pBStopPlaceSelectedAppModel$$serializer, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, pBStopPlaceSelectedAppModel$$serializer, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
