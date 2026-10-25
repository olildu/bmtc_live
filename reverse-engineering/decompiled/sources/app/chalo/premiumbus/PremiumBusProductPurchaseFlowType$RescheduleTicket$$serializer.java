package app.chalo.premiumbus;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/PremiumBusProductPurchaseFlowType.RescheduleTicket.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$RescheduleTicket;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusProductPurchaseFlowType$RescheduleTicket$$serializer implements GeneratedSerializer<PremiumBusProductPurchaseFlowType.RescheduleTicket> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusProductPurchaseFlowType$RescheduleTicket$$serializer f6861a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusProductPurchaseFlowType$RescheduleTicket$$serializer premiumBusProductPurchaseFlowType$RescheduleTicket$$serializer = new PremiumBusProductPurchaseFlowType$RescheduleTicket$$serializer();
        f6861a = premiumBusProductPurchaseFlowType$RescheduleTicket$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.PremiumBusProductPurchaseFlowType.RescheduleTicket", premiumBusProductPurchaseFlowType$RescheduleTicket$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("preferredTimeInMillis", false);
        pluginGeneratedSerialDescriptor.j("bookingId", false);
        pluginGeneratedSerialDescriptor.j("fpOriginDestinationAppModel", false);
        pluginGeneratedSerialDescriptor.j("reason", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{LongSerializer.f18151a, StringSerializer.f18170a, PBOriginDestinationAppModel$$serializer.f7092a, PremiumBusProductModificationReasonAppModel$$serializer.f2386a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        PBOriginDestinationAppModel pBOriginDestinationAppModel;
        PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            PBOriginDestinationAppModel pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PBOriginDestinationAppModel$$serializer.f7092a, null);
            str = strDecodeStringElement2;
            premiumBusProductModificationReasonAppModel = (PremiumBusProductModificationReasonAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PremiumBusProductModificationReasonAppModel$$serializer.f2386a, null);
            pBOriginDestinationAppModel = pBOriginDestinationAppModel2;
            i = 15;
            j = jDecodeLongElement;
        } else {
            boolean z = true;
            int i2 = 0;
            long jDecodeLongElement2 = 0;
            PBOriginDestinationAppModel pBOriginDestinationAppModel3 = null;
            PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    pBOriginDestinationAppModel3 = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PBOriginDestinationAppModel$$serializer.f7092a, pBOriginDestinationAppModel3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    premiumBusProductModificationReasonAppModel2 = (PremiumBusProductModificationReasonAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PremiumBusProductModificationReasonAppModel$$serializer.f2386a, premiumBusProductModificationReasonAppModel2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            pBOriginDestinationAppModel = pBOriginDestinationAppModel3;
            premiumBusProductModificationReasonAppModel = premiumBusProductModificationReasonAppModel2;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusProductPurchaseFlowType.RescheduleTicket(i, j, str, pBOriginDestinationAppModel, premiumBusProductModificationReasonAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusProductPurchaseFlowType.RescheduleTicket value = (PremiumBusProductPurchaseFlowType.RescheduleTicket) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PremiumBusProductPurchaseFlowType.RescheduleTicket.Companion companion = PremiumBusProductPurchaseFlowType.RescheduleTicket.INSTANCE;
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f6858a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, PBOriginDestinationAppModel$$serializer.f7092a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, PremiumBusProductModificationReasonAppModel$$serializer.f2386a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
