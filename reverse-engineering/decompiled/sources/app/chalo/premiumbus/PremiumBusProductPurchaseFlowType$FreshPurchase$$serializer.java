package app.chalo.premiumbus;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/PremiumBusProductPurchaseFlowType.FreshPurchase.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$FreshPurchase;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusProductPurchaseFlowType$FreshPurchase$$serializer implements GeneratedSerializer<PremiumBusProductPurchaseFlowType.FreshPurchase> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusProductPurchaseFlowType$FreshPurchase$$serializer f6859a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusProductPurchaseFlowType$FreshPurchase$$serializer premiumBusProductPurchaseFlowType$FreshPurchase$$serializer = new PremiumBusProductPurchaseFlowType$FreshPurchase$$serializer();
        f6859a = premiumBusProductPurchaseFlowType$FreshPurchase$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.PremiumBusProductPurchaseFlowType.FreshPurchase", premiumBusProductPurchaseFlowType$FreshPurchase$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("preferredTimeInMillis", false);
        pluginGeneratedSerialDescriptor.j("fromStopOrPlaceSelected", false);
        pluginGeneratedSerialDescriptor.j("toStopOrPlaceSelected", false);
        pluginGeneratedSerialDescriptor.j("preferredTimeInMillisForSlotSelection", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f18151a;
        PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
        return new KSerializer[]{longSerializer, pBStopPlaceSelectedAppModel$$serializer, pBStopPlaceSelectedAppModel$$serializer, longSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        long jDecodeLongElement;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, pBStopPlaceSelectedAppModel$$serializer, null);
            pBStopPlaceSelectedAppModel2 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, pBStopPlaceSelectedAppModel$$serializer, null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel4;
            i = 15;
            j = jDecodeLongElement2;
        } else {
            long jDecodeLongElement3 = 0;
            boolean z = true;
            int i2 = 0;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel5 = null;
            long jDecodeLongElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    pBStopPlaceSelectedAppModel3 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    pBStopPlaceSelectedAppModel5 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel5);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel3;
            jDecodeLongElement = jDecodeLongElement3;
            pBStopPlaceSelectedAppModel2 = pBStopPlaceSelectedAppModel5;
            j = jDecodeLongElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusProductPurchaseFlowType.FreshPurchase(i, j, pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusProductPurchaseFlowType.FreshPurchase value = (PremiumBusProductPurchaseFlowType.FreshPurchase) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PremiumBusProductPurchaseFlowType.FreshPurchase.Companion companion = PremiumBusProductPurchaseFlowType.FreshPurchase.INSTANCE;
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f6858a);
        PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, pBStopPlaceSelectedAppModel$$serializer, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, pBStopPlaceSelectedAppModel$$serializer, value.d);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
