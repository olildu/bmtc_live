package app.chalo.data;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/data/WalletSetupConfiguration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/data/WalletSetupConfiguration;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class WalletSetupConfiguration$$serializer implements GeneratedSerializer<WalletSetupConfiguration> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WalletSetupConfiguration$$serializer f2413a;
    private static final SerialDescriptor descriptor;

    static {
        WalletSetupConfiguration$$serializer walletSetupConfiguration$$serializer = new WalletSetupConfiguration$$serializer();
        f2413a = walletSetupConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.data.WalletSetupConfiguration", walletSetupConfiguration$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("enableConfig", true);
        pluginGeneratedSerialDescriptor.j("reclaimDuration", true);
        pluginGeneratedSerialDescriptor.j("timeoutDuration", true);
        pluginGeneratedSerialDescriptor.j("periodicSyncInterval", true);
        pluginGeneratedSerialDescriptor.j("maxQuickPayAmount", true);
        pluginGeneratedSerialDescriptor.j("quickPayActivationWindow", true);
        pluginGeneratedSerialDescriptor.j("suggestedDenominations", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = WalletSetupConfiguration.h;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{WalletEnableConfig$$serializer.f2411a, longSerializer, longSerializer, longSerializer, longSerializer, longSerializer, lazyArr[6].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        WalletEnableConfig walletEnableConfig;
        List list;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = WalletSetupConfiguration.h;
        int i2 = 5;
        int i3 = 3;
        List list2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            WalletEnableConfig walletEnableConfig2 = (WalletEnableConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, WalletEnableConfig$$serializer.f2411a, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            long jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            walletEnableConfig = walletEnableConfig2;
            i = 127;
            j = jDecodeLongElement4;
            j2 = jDecodeLongElement;
            j3 = jDecodeLongElement2;
            j4 = jDecodeLongElement3;
            j5 = jDecodeLongElement5;
        } else {
            long jDecodeLongElement6 = 0;
            boolean z = true;
            int i4 = 0;
            WalletEnableConfig walletEnableConfig3 = null;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            long jDecodeLongElement9 = 0;
            long jDecodeLongElement10 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                        i3 = 3;
                        break;
                    case 0:
                        walletEnableConfig3 = (WalletEnableConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, WalletEnableConfig$$serializer.f2411a, walletEnableConfig3);
                        i4 |= 1;
                        i2 = 5;
                        i3 = 3;
                        break;
                    case 1:
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        jDecodeLongElement9 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i3);
                        i4 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement10 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i2);
                        i4 |= 32;
                        break;
                    case 6:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), list2);
                        i4 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            walletEnableConfig = walletEnableConfig3;
            list = list2;
            j = jDecodeLongElement6;
            j2 = jDecodeLongElement7;
            j3 = jDecodeLongElement8;
            j4 = jDecodeLongElement9;
            j5 = jDecodeLongElement10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletSetupConfiguration(i, walletEnableConfig, j2, j3, j4, j, j5, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        WalletSetupConfiguration value = (WalletSetupConfiguration) obj;
        Intrinsics.i(value, "value");
        List list = value.g;
        long j = value.f;
        long j2 = value.e;
        long j3 = value.d;
        long j4 = value.c;
        long j5 = value.b;
        WalletEnableConfig walletEnableConfig = value.f2412a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = WalletSetupConfiguration.h;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(walletEnableConfig, new WalletEnableConfig())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, WalletEnableConfig$$serializer.f2411a, walletEnableConfig);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || j5 != CalendarModelKt.MillisecondsIn24Hours) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, j5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || j4 != CalendarModelKt.MillisecondsIn24Hours) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, j4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || j3 != CalendarModelKt.MillisecondsIn24Hours) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, j3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || j2 != SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || j != WalletSetupConfiguration.i) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(list, WalletSetupConfiguration.j)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
