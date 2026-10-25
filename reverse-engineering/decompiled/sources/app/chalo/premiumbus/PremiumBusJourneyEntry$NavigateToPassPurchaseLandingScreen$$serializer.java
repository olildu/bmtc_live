package app.chalo.premiumbus;

import app.chalo.constants.Source;
import app.chalo.scenes.args.PassLandingFlowType;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$$serializer implements GeneratedSerializer<PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$$serializer f6852a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$$serializer premiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$$serializer = new PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$$serializer();
        f6852a = premiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen", premiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("flowType", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("isRouteBasedPass", true);
        pluginGeneratedSerialDescriptor.j("deeplinkAttribution", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen.f;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), BooleanSerializer.f18123a, BuiltinSerializersKt.c(StringSerializer.f18170a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        int i;
        PassLandingFlowType passLandingFlowType;
        Source source;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen.f;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PassLandingFlowType passLandingFlowType2 = (PassLandingFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            Source source2 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            source = source2;
            passLandingFlowType = passLandingFlowType2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, null);
            z = zDecodeBooleanElement;
            i = 15;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            PassLandingFlowType passLandingFlowType3 = null;
            Source source3 = null;
            String str2 = null;
            int i2 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    passLandingFlowType3 = (PassLandingFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), passLandingFlowType3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    source3 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), source3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str2);
                    i2 |= 8;
                }
            }
            z = zDecodeBooleanElement2;
            i = i2;
            passLandingFlowType = passLandingFlowType3;
            source = source3;
            str = str2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen(i, passLandingFlowType, source, z, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen value = (PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen.f;
        SerializationStrategy serializationStrategy = (SerializationStrategy) lazyArr[0].getValue();
        PassLandingFlowType passLandingFlowType = value.b;
        String str = value.e;
        boolean z = value.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, passLandingFlowType);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), value.c);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
