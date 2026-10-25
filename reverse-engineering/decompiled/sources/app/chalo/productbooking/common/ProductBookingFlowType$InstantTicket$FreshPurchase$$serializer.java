package app.chalo.productbooking.common;

import app.chalo.data.StopBasedRouteSelectionFlowType;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/ProductBookingFlowType.InstantTicket.FreshPurchase.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$InstantTicket$FreshPurchase;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ProductBookingFlowType$InstantTicket$FreshPurchase$$serializer implements GeneratedSerializer<ProductBookingFlowType.InstantTicket.FreshPurchase> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductBookingFlowType$InstantTicket$FreshPurchase$$serializer f8087a;
    private static final SerialDescriptor descriptor;

    static {
        ProductBookingFlowType$InstantTicket$FreshPurchase$$serializer productBookingFlowType$InstantTicket$FreshPurchase$$serializer = new ProductBookingFlowType$InstantTicket$FreshPurchase$$serializer();
        f8087a = productBookingFlowType$InstantTicket$FreshPurchase$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.ProductBookingFlowType.InstantTicket.FreshPurchase", productBookingFlowType$InstantTicket$FreshPurchase$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("isRouteBasedSelection", false);
        pluginGeneratedSerialDescriptor.j("stopBasedRouteSelectionFlowType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.f18123a, ProductBookingFlowType.InstantTicket.FreshPurchase.e[1].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductBookingFlowType.InstantTicket.FreshPurchase.e;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            stopBasedRouteSelectionFlowType = (StopBasedRouteSelectionFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            zDecodeBooleanElement = false;
            StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    stopBasedRouteSelectionFlowType2 = (StopBasedRouteSelectionFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), stopBasedRouteSelectionFlowType2);
                    i2 |= 2;
                }
            }
            i = i2;
            stopBasedRouteSelectionFlowType = stopBasedRouteSelectionFlowType2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductBookingFlowType.InstantTicket.FreshPurchase(i, zDecodeBooleanElement, stopBasedRouteSelectionFlowType);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProductBookingFlowType.InstantTicket.FreshPurchase value = (ProductBookingFlowType.InstantTicket.FreshPurchase) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductBookingFlowType.InstantTicket.FreshPurchase.e;
        boolean z = value.c;
        StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType = value.d;
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.d(stopBasedRouteSelectionFlowType, StopBasedRouteSelectionFlowType.InstantTicket.INSTANCE)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), stopBasedRouteSelectionFlowType);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
