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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$$serializer implements GeneratedSerializer<PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$$serializer f6862a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$$serializer premiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$$serializer = new PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$$serializer();
        f6862a = premiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass", premiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("preferredTimeInMillis", false);
        pluginGeneratedSerialDescriptor.j("selectedPassId", false);
        pluginGeneratedSerialDescriptor.j("fromStopOrPlaceSelected", false);
        pluginGeneratedSerialDescriptor.j("toStopOrPlaceSelected", false);
        pluginGeneratedSerialDescriptor.j("preferredTimeInMillisForSlotSelection", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f18151a;
        PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
        return new KSerializer[]{longSerializer, StringSerializer.f18170a, pBStopPlaceSelectedAppModel$$serializer, pBStopPlaceSelectedAppModel$$serializer, longSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        long jDecodeLongElement;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, pBStopPlaceSelectedAppModel$$serializer, null);
            str = strDecodeStringElement2;
            pBStopPlaceSelectedAppModel2 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, pBStopPlaceSelectedAppModel$$serializer, null);
            i = 31;
            pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel3;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            j = jDecodeLongElement2;
        } else {
            long jDecodeLongElement3 = 0;
            boolean z = true;
            int i2 = 0;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = null;
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
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    pBStopPlaceSelectedAppModel4 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel4);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    pBStopPlaceSelectedAppModel5 = (PBStopPlaceSelectedAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PBStopPlaceSelectedAppModel$$serializer.f7096a, pBStopPlaceSelectedAppModel5);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                    i2 |= 16;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            jDecodeLongElement = jDecodeLongElement3;
            pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel4;
            pBStopPlaceSelectedAppModel2 = pBStopPlaceSelectedAppModel5;
            j = jDecodeLongElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass(i, j, str, pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass value = (PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass.Companion companion = PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass.INSTANCE;
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f6858a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.c);
        PBStopPlaceSelectedAppModel$$serializer pBStopPlaceSelectedAppModel$$serializer = PBStopPlaceSelectedAppModel$$serializer.f7096a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, pBStopPlaceSelectedAppModel$$serializer, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, pBStopPlaceSelectedAppModel$$serializer, value.e);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
