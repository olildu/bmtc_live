package app.chalo.premiumbus;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/PremiumBusProductPurchaseFlowType.RePurchaseTicket.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$RePurchaseTicket;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusProductPurchaseFlowType$RePurchaseTicket$$serializer implements GeneratedSerializer<PremiumBusProductPurchaseFlowType.RePurchaseTicket> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusProductPurchaseFlowType$RePurchaseTicket$$serializer f6860a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusProductPurchaseFlowType$RePurchaseTicket$$serializer premiumBusProductPurchaseFlowType$RePurchaseTicket$$serializer = new PremiumBusProductPurchaseFlowType$RePurchaseTicket$$serializer();
        f6860a = premiumBusProductPurchaseFlowType$RePurchaseTicket$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.PremiumBusProductPurchaseFlowType.RePurchaseTicket", premiumBusProductPurchaseFlowType$RePurchaseTicket$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("preferredTimeInMillis", false);
        pluginGeneratedSerialDescriptor.j("fpOriginDestinationAppModel", false);
        pluginGeneratedSerialDescriptor.j("preferredTimeInMillisForSlotSelection", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{longSerializer, PBOriginDestinationAppModel$$serializer.f7092a, longSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        PBOriginDestinationAppModel pBOriginDestinationAppModel;
        long jDecodeLongElement;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        PBOriginDestinationAppModel pBOriginDestinationAppModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            pBOriginDestinationAppModel = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            i = 7;
            j = jDecodeLongElement2;
        } else {
            long jDecodeLongElement3 = 0;
            boolean z = true;
            int i2 = 0;
            long jDecodeLongElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, pBOriginDestinationAppModel2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            pBOriginDestinationAppModel = pBOriginDestinationAppModel2;
            jDecodeLongElement = jDecodeLongElement3;
            j = jDecodeLongElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusProductPurchaseFlowType.RePurchaseTicket(i, j, pBOriginDestinationAppModel, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusProductPurchaseFlowType.RePurchaseTicket value = (PremiumBusProductPurchaseFlowType.RePurchaseTicket) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PremiumBusProductPurchaseFlowType.RePurchaseTicket.Companion companion = PremiumBusProductPurchaseFlowType.RePurchaseTicket.INSTANCE;
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f6858a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
