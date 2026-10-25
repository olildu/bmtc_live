package app.chalo.recent.model.app;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/recent/model/app/RecentLocationPairAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/recent/model/app/RecentLocationPairAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RecentLocationPairAppModel$$serializer implements GeneratedSerializer<RecentLocationPairAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecentLocationPairAppModel$$serializer f8997a;
    private static final SerialDescriptor descriptor;

    static {
        RecentLocationPairAppModel$$serializer recentLocationPairAppModel$$serializer = new RecentLocationPairAppModel$$serializer();
        f8997a = recentLocationPairAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.recent.model.app.RecentLocationPairAppModel", recentLocationPairAppModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("recentsId", false);
        pluginGeneratedSerialDescriptor.j("recentsCityId", false);
        pluginGeneratedSerialDescriptor.j("recentsAccessTime", false);
        pluginGeneratedSerialDescriptor.j("pairId", false);
        pluginGeneratedSerialDescriptor.j("cityId", false);
        pluginGeneratedSerialDescriptor.j("fromEndpoint", false);
        pluginGeneratedSerialDescriptor.j("toEndpoint", false);
        pluginGeneratedSerialDescriptor.j("accessTime", true);
        pluginGeneratedSerialDescriptor.j("accessCount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RecentLocationPairAppModel.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{stringSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, lazyArr[5].getValue(), lazyArr[6].getValue(), longSerializer, IntSerializer.f18146a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel;
        RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel2;
        int i;
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        long j2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RecentLocationPairAppModel.k;
        int i2 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel3 = (RecentLocationPairEndpointAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel4 = (RecentLocationPairEndpointAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            recentLocationPairEndpointAppModel = recentLocationPairEndpointAppModel4;
            str = strDecodeStringElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            str3 = strDecodeStringElement3;
            i = 511;
            str4 = strDecodeStringElement4;
            recentLocationPairEndpointAppModel2 = recentLocationPairEndpointAppModel3;
            j = jDecodeLongElement2;
            str2 = strDecodeStringElement2;
            j2 = jDecodeLongElement;
        } else {
            long jDecodeLongElement3 = 0;
            boolean z = true;
            int iDecodeIntElement2 = 0;
            RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel5 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            long jDecodeLongElement4 = 0;
            int i3 = 0;
            RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        break;
                    case 0:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        recentLocationPairEndpointAppModel6 = (RecentLocationPairEndpointAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), recentLocationPairEndpointAppModel6);
                        i3 |= 32;
                        break;
                    case 6:
                        recentLocationPairEndpointAppModel5 = (RecentLocationPairEndpointAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), recentLocationPairEndpointAppModel5);
                        i3 |= 64;
                        break;
                    case 7:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i2);
                        i3 |= 128;
                        break;
                    case 8:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i3 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            recentLocationPairEndpointAppModel = recentLocationPairEndpointAppModel5;
            recentLocationPairEndpointAppModel2 = recentLocationPairEndpointAppModel6;
            i = i3;
            j = jDecodeLongElement3;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            j2 = jDecodeLongElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecentLocationPairAppModel(i, str, str2, j2, str3, str4, recentLocationPairEndpointAppModel2, recentLocationPairEndpointAppModel, j, iDecodeIntElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RecentLocationPairAppModel value = (RecentLocationPairAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecentLocationPairAppModel.Companion companion = RecentLocationPairAppModel.INSTANCE;
        RecentsType.a(value, compositeEncoderBeginStructure, serialDescriptor);
        Lazy[] lazyArr = RecentLocationPairAppModel.k;
        String str = value.e;
        int i = value.j;
        long j = value.i;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.h);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || j != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 8, i);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
