package app.chalo.recent.model.app;

import app.chalo.location.LatLng;
import app.chalo.location.LatLngSerializer;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/recent/model/app/RecentPlaceAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/recent/model/app/RecentPlaceAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RecentPlaceAppModel$$serializer implements GeneratedSerializer<RecentPlaceAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecentPlaceAppModel$$serializer f9002a;
    private static final SerialDescriptor descriptor;

    static {
        RecentPlaceAppModel$$serializer recentPlaceAppModel$$serializer = new RecentPlaceAppModel$$serializer();
        f9002a = recentPlaceAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.recent.model.app.RecentPlaceAppModel", recentPlaceAppModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("recentsId", false);
        pluginGeneratedSerialDescriptor.j("recentsCityId", false);
        pluginGeneratedSerialDescriptor.j("recentsAccessTime", false);
        pluginGeneratedSerialDescriptor.j("placeId", false);
        pluginGeneratedSerialDescriptor.j("searchPartner", false);
        pluginGeneratedSerialDescriptor.j("locationTitle", false);
        pluginGeneratedSerialDescriptor.j("cityId", false);
        pluginGeneratedSerialDescriptor.j("locationDescription", true);
        pluginGeneratedSerialDescriptor.j("latLng", false);
        pluginGeneratedSerialDescriptor.j("recentsSpecialStatus", false);
        pluginGeneratedSerialDescriptor.j("accessTime", true);
        pluginGeneratedSerialDescriptor.j("accessCount", true);
        pluginGeneratedSerialDescriptor.j("label", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RecentPlaceAppModel.o;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{stringSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c(stringSerializer), LatLngSerializer.f5136a, lazyArr[9].getValue(), longSerializer, IntSerializer.f18146a, BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        RecentsSpecialStatus recentsSpecialStatus;
        LatLng latLng;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i2;
        long j;
        long j2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RecentPlaceAppModel.o;
        int i3 = 10;
        int i4 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            LatLng latLng2 = (LatLng) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, LatLngSerializer.f5136a, null);
            RecentsSpecialStatus recentsSpecialStatus2 = (RecentsSpecialStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 10);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            i = 8191;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str3 = strDecodeStringElement2;
            i2 = iDecodeIntElement;
            str = str8;
            str7 = strDecodeStringElement6;
            str6 = strDecodeStringElement5;
            str4 = strDecodeStringElement3;
            latLng = latLng2;
            str5 = strDecodeStringElement4;
            j = jDecodeLongElement2;
            recentsSpecialStatus = recentsSpecialStatus2;
            j2 = jDecodeLongElement;
        } else {
            int iDecodeIntElement2 = 0;
            strDecodeStringElement = null;
            String str9 = null;
            RecentsSpecialStatus recentsSpecialStatus3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            boolean z = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            i = 0;
            String str10 = null;
            LatLng latLng3 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 5;
                        break;
                    case 0:
                        i |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = 10;
                        i4 = 5;
                        break;
                    case 1:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i3 = 10;
                        i4 = 5;
                        break;
                    case 2:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i |= 4;
                        i3 = 10;
                        i4 = 5;
                        break;
                    case 3:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        i3 = 10;
                        i4 = 5;
                        break;
                    case 4:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        i3 = 10;
                        i4 = 5;
                        break;
                    case 5:
                        int i5 = i4;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i |= 32;
                        i4 = i5;
                        i3 = 10;
                        break;
                    case 6:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        i3 = 10;
                        i4 = 5;
                        break;
                    case 7:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str10);
                        i |= 128;
                        i3 = 10;
                        i4 = 5;
                        break;
                    case 8:
                        latLng3 = (LatLng) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, LatLngSerializer.f5136a, latLng3);
                        i |= 256;
                        i3 = 10;
                        i4 = 5;
                        break;
                    case 9:
                        recentsSpecialStatus3 = (RecentsSpecialStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), recentsSpecialStatus3);
                        i |= 512;
                        i3 = 10;
                        i4 = 5;
                        break;
                    case 10:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i3);
                        i |= 1024;
                        i4 = 5;
                        break;
                    case 11:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
                        i |= 2048;
                        i4 = 5;
                        break;
                    case 12:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str9);
                        i |= 4096;
                        i4 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str10;
            str2 = str9;
            recentsSpecialStatus = recentsSpecialStatus3;
            latLng = latLng3;
            str3 = strDecodeStringElement10;
            str4 = strDecodeStringElement11;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement9;
            i2 = iDecodeIntElement2;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
        }
        String str11 = strDecodeStringElement;
        int i6 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecentPlaceAppModel(i6, str11, str3, j2, str4, str5, str6, str7, str, latLng, recentsSpecialStatus, j, i2, str2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RecentPlaceAppModel value = (RecentPlaceAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecentPlaceAppModel.Companion companion = RecentPlaceAppModel.INSTANCE;
        RecentsType.a(value, compositeEncoderBeginStructure, serialDescriptor);
        Lazy[] lazyArr = RecentPlaceAppModel.o;
        String str = value.e;
        String str2 = value.n;
        int i = value.m;
        long j = value.l;
        String str3 = value.i;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.h);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str3);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, LatLngSerializer.f5136a, value.j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), value.k);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || j != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 10, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 11, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
