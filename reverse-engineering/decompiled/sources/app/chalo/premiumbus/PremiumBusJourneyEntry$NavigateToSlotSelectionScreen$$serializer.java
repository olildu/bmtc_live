package app.chalo.premiumbus;

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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/PremiumBusJourneyEntry.NavigateToSlotSelectionScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToSlotSelectionScreen;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusJourneyEntry$NavigateToSlotSelectionScreen$$serializer implements GeneratedSerializer<PremiumBusJourneyEntry.NavigateToSlotSelectionScreen> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusJourneyEntry$NavigateToSlotSelectionScreen$$serializer f6855a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusJourneyEntry$NavigateToSlotSelectionScreen$$serializer premiumBusJourneyEntry$NavigateToSlotSelectionScreen$$serializer = new PremiumBusJourneyEntry$NavigateToSlotSelectionScreen$$serializer();
        f6855a = premiumBusJourneyEntry$NavigateToSlotSelectionScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.PremiumBusJourneyEntry.NavigateToSlotSelectionScreen", premiumBusJourneyEntry$NavigateToSlotSelectionScreen$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("premiumBusProductPurchaseFlowType", false);
        pluginGeneratedSerialDescriptor.j("deeplinkAttribution", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PremiumBusJourneyEntry.NavigateToSlotSelectionScreen.d[0].getValue(), BuiltinSerializersKt.c(StringSerializer.f18170a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PremiumBusJourneyEntry.NavigateToSlotSelectionScreen.d;
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            premiumBusProductPurchaseFlowType = (PremiumBusProductPurchaseFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    premiumBusProductPurchaseFlowType2 = (PremiumBusProductPurchaseFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), premiumBusProductPurchaseFlowType2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str2);
                    i2 |= 2;
                }
            }
            i = i2;
            premiumBusProductPurchaseFlowType = premiumBusProductPurchaseFlowType2;
            str = str2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusJourneyEntry.NavigateToSlotSelectionScreen(i, premiumBusProductPurchaseFlowType, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusJourneyEntry.NavigateToSlotSelectionScreen value = (PremiumBusJourneyEntry.NavigateToSlotSelectionScreen) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SerializationStrategy serializationStrategy = (SerializationStrategy) PremiumBusJourneyEntry.NavigateToSlotSelectionScreen.d[0].getValue();
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType = value.b;
        String str = value.c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, premiumBusProductPurchaseFlowType);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
