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
import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/ProductBookingFlowType.PremiumBusProduct.ReserveSeatThroughPass.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer implements GeneratedSerializer<ProductBookingFlowType.PremiumBusProduct.ReserveSeatThroughPass> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer f8093a;
    private static final SerialDescriptor descriptor;

    static {
        ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer productBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer = new ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer();
        f8093a = productBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.ProductBookingFlowType.PremiumBusProduct.ReserveSeatThroughPass", productBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("selectedPassId", false);
        pluginGeneratedSerialDescriptor.j("originDestinationAppModel", false);
        pluginGeneratedSerialDescriptor.j("fromStopOrPlaceSelected", true);
        pluginGeneratedSerialDescriptor.j("toStopOrPlaceSelected", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c(PBOriginDestinationAppModel$$serializer.f7092a);
        PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
        return new KSerializer[]{StringSerializer.f18170a, kSerializerC, BuiltinSerializersKt.c(pBStopPlaceSelectedAppModel$$serializer), BuiltinSerializersKt.c(pBStopPlaceSelectedAppModel$$serializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        PBOriginDestinationAppModel pBOriginDestinationAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            PBOriginDestinationAppModel pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, null);
            PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, pBStopPlaceSelectedAppModel$$serializer, null);
            str = strDecodeStringElement2;
            pBStopPlaceSelectedAppModel2 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, pBStopPlaceSelectedAppModel$$serializer, null);
            pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel3;
            pBOriginDestinationAppModel = pBOriginDestinationAppModel2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            PBOriginDestinationAppModel pBOriginDestinationAppModel3 = null;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = null;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    pBOriginDestinationAppModel3 = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, pBOriginDestinationAppModel3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    pBStopPlaceSelectedAppModel4 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel4);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    pBStopPlaceSelectedAppModel5 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel5);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            pBOriginDestinationAppModel = pBOriginDestinationAppModel3;
            pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel4;
            pBStopPlaceSelectedAppModel2 = pBStopPlaceSelectedAppModel5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductBookingFlowType.PremiumBusProduct.ReserveSeatThroughPass(i, str, pBOriginDestinationAppModel, pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProductBookingFlowType.PremiumBusProduct.ReserveSeatThroughPass value = (ProductBookingFlowType.PremiumBusProduct.ReserveSeatThroughPass) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.c;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = value.f;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = value.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || pBStopPlaceSelectedAppModel2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || pBStopPlaceSelectedAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
