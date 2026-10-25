package app.chalo.premiumbus;

import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsNavAppModel;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsNavAppModel$$serializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/PremiumBusJourneyEntry.NavigateToStopDetailsScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToStopDetailsScreen;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusJourneyEntry$NavigateToStopDetailsScreen$$serializer implements GeneratedSerializer<PremiumBusJourneyEntry.NavigateToStopDetailsScreen> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusJourneyEntry$NavigateToStopDetailsScreen$$serializer f6856a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusJourneyEntry$NavigateToStopDetailsScreen$$serializer premiumBusJourneyEntry$NavigateToStopDetailsScreen$$serializer = new PremiumBusJourneyEntry$NavigateToStopDetailsScreen$$serializer();
        f6856a = premiumBusJourneyEntry$NavigateToStopDetailsScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.PremiumBusJourneyEntry.NavigateToStopDetailsScreen", premiumBusJourneyEntry$NavigateToStopDetailsScreen$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("stopDetailsNavAppModel", false);
        pluginGeneratedSerialDescriptor.j("isPreBookingFlow", true);
        pluginGeneratedSerialDescriptor.j("deeplinkAttribution", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PBStopDetailsNavAppModel$$serializer.f7939a, BooleanSerializer.f18123a, BuiltinSerializersKt.c(StringSerializer.f18170a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        PBStopDetailsNavAppModel pBStopDetailsNavAppModel;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            pBStopDetailsNavAppModel = (PBStopDetailsNavAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PBStopDetailsNavAppModel$$serializer.f7939a, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, null);
            i = 7;
        } else {
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            PBStopDetailsNavAppModel pBStopDetailsNavAppModel2 = null;
            String str2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    pBStopDetailsNavAppModel2 = (PBStopDetailsNavAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PBStopDetailsNavAppModel$$serializer.f7939a, pBStopDetailsNavAppModel2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str2);
                    i2 |= 4;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i2;
            pBStopDetailsNavAppModel = pBStopDetailsNavAppModel2;
            str = str2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusJourneyEntry.NavigateToStopDetailsScreen(i, pBStopDetailsNavAppModel, zDecodeBooleanElement, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusJourneyEntry.NavigateToStopDetailsScreen value = (PremiumBusJourneyEntry.NavigateToStopDetailsScreen) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PremiumBusJourneyEntry.NavigateToStopDetailsScreen.Companion companion = PremiumBusJourneyEntry.NavigateToStopDetailsScreen.INSTANCE;
        PBStopDetailsNavAppModel$$serializer pBStopDetailsNavAppModel$$serializer = PBStopDetailsNavAppModel$$serializer.f7939a;
        PBStopDetailsNavAppModel pBStopDetailsNavAppModel = value.b;
        String str = value.d;
        boolean z = value.c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, pBStopDetailsNavAppModel$$serializer, pBStopDetailsNavAppModel);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
