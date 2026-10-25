package app.chalo.productbooking.common;

import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.data.PremiumBusProductModificationReasonAppModel$$serializer;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel$$serializer;
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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/ProductBookingFlowType.PremiumBusProduct.RescheduleTicket.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$RescheduleTicket;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ProductBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer implements GeneratedSerializer<ProductBookingFlowType.PremiumBusProduct.RescheduleTicket> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer f8092a;
    private static final SerialDescriptor descriptor;

    static {
        ProductBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer productBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer = new ProductBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer();
        f8092a = productBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.ProductBookingFlowType.PremiumBusProduct.RescheduleTicket", productBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("bookingId", false);
        pluginGeneratedSerialDescriptor.j("originDestinationAppModel", false);
        pluginGeneratedSerialDescriptor.j("reason", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.f18170a, PBOriginDestinationAppModel$$serializer.f7092a, PremiumBusProductModificationReasonAppModel$$serializer.f2386a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String strDecodeStringElement;
        PBOriginDestinationAppModel pBOriginDestinationAppModel;
        PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            pBOriginDestinationAppModel = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, null);
            premiumBusProductModificationReasonAppModel = (PremiumBusProductModificationReasonAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PremiumBusProductModificationReasonAppModel$$serializer.f2386a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            PBOriginDestinationAppModel pBOriginDestinationAppModel2 = null;
            PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, pBOriginDestinationAppModel2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    premiumBusProductModificationReasonAppModel2 = (PremiumBusProductModificationReasonAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PremiumBusProductModificationReasonAppModel$$serializer.f2386a, premiumBusProductModificationReasonAppModel2);
                    i2 |= 4;
                }
            }
            i = i2;
            strDecodeStringElement = strDecodeStringElement2;
            pBOriginDestinationAppModel = pBOriginDestinationAppModel2;
            premiumBusProductModificationReasonAppModel = premiumBusProductModificationReasonAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductBookingFlowType.PremiumBusProduct.RescheduleTicket(i, strDecodeStringElement, pBOriginDestinationAppModel, premiumBusProductModificationReasonAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProductBookingFlowType.PremiumBusProduct.RescheduleTicket value = (ProductBookingFlowType.PremiumBusProduct.RescheduleTicket) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, PremiumBusProductModificationReasonAppModel$$serializer.f2386a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
