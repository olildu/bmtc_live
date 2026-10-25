package app.chalo.productbooking.common;

import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel$$serializer;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer implements GeneratedSerializer<ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer f8089a;
    private static final SerialDescriptor descriptor;

    static {
        ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer productBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer = new ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer();
        f8089a = productBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner", productBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("routeIds", false);
        pluginGeneratedSerialDescriptor.j("fromStopOrPlaceSelected", false);
        pluginGeneratedSerialDescriptor.j("toStopOrPlaceSelected", false);
        pluginGeneratedSerialDescriptor.j("timeInMillisForRepurchase", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
        return new KSerializer[]{ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner.g[0].getValue(), pBStopPlaceSelectedAppModel$$serializer, pBStopPlaceSelectedAppModel$$serializer, LongSerializer.f18151a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        long jDecodeLongElement;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner.g;
        List list2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, pBStopPlaceSelectedAppModel$$serializer, null);
            list = list3;
            pBStopPlaceSelectedAppModel2 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, pBStopPlaceSelectedAppModel$$serializer, null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel3;
            i = 15;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            int i2 = 0;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = null;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    pBStopPlaceSelectedAppModel4 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel4);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    pBStopPlaceSelectedAppModel5 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel5);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list2;
            jDecodeLongElement = jDecodeLongElement2;
            pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel4;
            pBStopPlaceSelectedAppModel2 = pBStopPlaceSelectedAppModel5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner(i, list, pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner value = (ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner.g[0].getValue(), value.c);
        PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, pBStopPlaceSelectedAppModel$$serializer, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, pBStopPlaceSelectedAppModel$$serializer, value.e);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
