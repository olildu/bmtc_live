package app.chalo.recent.database.entities;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/recent/database/entities/RecentPlaceEntity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/recent/database/entities/RecentPlaceEntity;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RecentPlaceEntity$$serializer implements GeneratedSerializer<RecentPlaceEntity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecentPlaceEntity$$serializer f8941a;
    private static final SerialDescriptor descriptor;

    static {
        RecentPlaceEntity$$serializer recentPlaceEntity$$serializer = new RecentPlaceEntity$$serializer();
        f8941a = recentPlaceEntity$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.recent.database.entities.RecentPlaceEntity", recentPlaceEntity$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("placeId", false);
        pluginGeneratedSerialDescriptor.j("searchPartner", false);
        pluginGeneratedSerialDescriptor.j("cityId", false);
        pluginGeneratedSerialDescriptor.j("locationDescription", true);
        pluginGeneratedSerialDescriptor.j("locationTitle", false);
        pluginGeneratedSerialDescriptor.j("latLng", false);
        pluginGeneratedSerialDescriptor.j("recentsSpecialEntityStatus", false);
        pluginGeneratedSerialDescriptor.j("accessTime", true);
        pluginGeneratedSerialDescriptor.j("accessCount", true);
        pluginGeneratedSerialDescriptor.j("label", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RecentPlaceEntity.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c(stringSerializer), stringSerializer, LatLngSerializer.f5136a, lazyArr[6].getValue(), LongSerializer.f18151a, IntSerializer.f18146a, BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        RecentsSpecialEntityStatus recentsSpecialEntityStatus;
        LatLng latLng;
        String str2;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RecentPlaceEntity.k;
        int i3 = 9;
        int i4 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            LatLng latLng2 = (LatLng) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, LatLngSerializer.f5136a, null);
            RecentsSpecialEntityStatus recentsSpecialEntityStatus2 = (RecentsSpecialEntityStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            recentsSpecialEntityStatus = recentsSpecialEntityStatus2;
            str3 = strDecodeStringElement;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            i = iDecodeIntElement;
            latLng = latLng2;
            str2 = str7;
            i2 = 1023;
            str6 = strDecodeStringElement4;
            str5 = strDecodeStringElement3;
            str4 = strDecodeStringElement2;
            j = jDecodeLongElement;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
            String str8 = null;
            RecentsSpecialEntityStatus recentsSpecialEntityStatus3 = null;
            LatLng latLng3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            long jDecodeLongElement2 = 0;
            int i5 = 0;
            String str9 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 9;
                        break;
                    case 0:
                        i5 |= 1;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 1:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 2:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 3:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str9);
                        i5 |= 8;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 4:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        latLng3 = (LatLng) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, LatLngSerializer.f5136a, latLng3);
                        i5 |= 32;
                        break;
                    case 6:
                        recentsSpecialEntityStatus3 = (RecentsSpecialEntityStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), recentsSpecialEntityStatus3);
                        i5 |= 64;
                        break;
                    case 7:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i4);
                        i5 |= 128;
                        break;
                    case 8:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i5 |= 256;
                        break;
                    case 9:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.f18170a, str8);
                        i5 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement2;
            str = str8;
            recentsSpecialEntityStatus = recentsSpecialEntityStatus3;
            latLng = latLng3;
            str2 = str9;
            i2 = i5;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement5;
            str6 = strDecodeStringElement6;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecentPlaceEntity(i2, str3, str4, str5, str2, str6, latLng, recentsSpecialEntityStatus, j, i, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RecentPlaceEntity value = (RecentPlaceEntity) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RecentPlaceEntity.k;
        String str = value.f8940a;
        String str2 = value.j;
        int i = value.i;
        long j = value.h;
        String str3 = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str3);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, LatLngSerializer.f5136a, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.g);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || j != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 8, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
