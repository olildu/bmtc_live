package app.chalo.home.data;

import androidx.compose.material3.internal.CalendarModelKt;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/home/data/HistoryScreenConfigForCity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/home/data/HistoryScreenConfigForCity;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class HistoryScreenConfigForCity$$serializer implements GeneratedSerializer<HistoryScreenConfigForCity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HistoryScreenConfigForCity$$serializer f2871a;
    private static final SerialDescriptor descriptor;

    static {
        HistoryScreenConfigForCity$$serializer historyScreenConfigForCity$$serializer = new HistoryScreenConfigForCity$$serializer();
        f2871a = historyScreenConfigForCity$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.home.data.HistoryScreenConfigForCity", historyScreenConfigForCity$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("cityName", false);
        pluginGeneratedSerialDescriptor.j("isEnabled", false);
        pluginGeneratedSerialDescriptor.j("minAppVer", false);
        pluginGeneratedSerialDescriptor.j("maxAppVer", false);
        pluginGeneratedSerialDescriptor.j("blacklistedAppVer", false);
        pluginGeneratedSerialDescriptor.j("passRenewNudgeTimeInMillis", true);
        pluginGeneratedSerialDescriptor.j("thresholdToReTriggerHistoryCall", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = HistoryScreenConfigForCity.h;
        IntSerializer intSerializer = IntSerializer.f18146a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{StringSerializer.f18170a, BooleanSerializer.f18123a, intSerializer, intSerializer, lazyArr[4].getValue(), longSerializer, longSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        int i2;
        long jDecodeLongElement;
        int i3;
        boolean z;
        long j;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = HistoryScreenConfigForCity.h;
        int i4 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            list = list2;
            str = strDecodeStringElement;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            i = iDecodeIntElement2;
            i2 = iDecodeIntElement;
            i3 = 127;
            z = zDecodeBooleanElement;
            j = jDecodeLongElement2;
        } else {
            long jDecodeLongElement3 = 0;
            boolean z2 = true;
            int iDecodeIntElement3 = 0;
            int i5 = 0;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement2 = null;
            long jDecodeLongElement4 = 0;
            int iDecodeIntElement4 = 0;
            List list3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 6;
                        break;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 6;
                        break;
                    case 1:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), list3);
                        i5 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i5 |= 32;
                        break;
                    case 6:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i4);
                        i5 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement3;
            list = list3;
            i2 = iDecodeIntElement4;
            jDecodeLongElement = jDecodeLongElement3;
            i3 = i5;
            z = zDecodeBooleanElement2;
            j = jDecodeLongElement4;
            str = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HistoryScreenConfigForCity(i3, str, z, i2, i, list, j, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        HistoryScreenConfigForCity value = (HistoryScreenConfigForCity) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = HistoryScreenConfigForCity.h;
        String str = value.f2870a;
        long j = value.g;
        long j2 = value.f;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.e);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || j2 != CalendarModelKt.MillisecondsIn24Hours) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || j != 30000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, j);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
