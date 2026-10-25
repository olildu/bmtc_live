package app.chalo.recent.database.entities;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.RecentAdditionalRouteInfoEntityTypeDeserializer;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/recent/database/entities/RecentStopAndRouteBasedTripEntity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/recent/database/entities/RecentStopAndRouteBasedTripEntity;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RecentStopAndRouteBasedTripEntity$$serializer implements GeneratedSerializer<RecentStopAndRouteBasedTripEntity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecentStopAndRouteBasedTripEntity$$serializer f8944a;
    private static final SerialDescriptor descriptor;

    static {
        RecentStopAndRouteBasedTripEntity$$serializer recentStopAndRouteBasedTripEntity$$serializer = new RecentStopAndRouteBasedTripEntity$$serializer();
        f8944a = recentStopAndRouteBasedTripEntity$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity", recentStopAndRouteBasedTripEntity$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("cityId", false);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("additionRouteInfo", false);
        pluginGeneratedSerialDescriptor.j("originStop", false);
        pluginGeneratedSerialDescriptor.j("destinationStop", false);
        pluginGeneratedSerialDescriptor.j("transitMode", false);
        pluginGeneratedSerialDescriptor.j("accessTime", true);
        pluginGeneratedSerialDescriptor.j("accessCount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RecentStopAndRouteBasedTripEntity.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        RecentStopInfoEntity$$serializer recentStopInfoEntity$$serializer = RecentStopInfoEntity$$serializer.f8948a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, RecentAdditionalRouteInfoEntityTypeDeserializer.c, recentStopInfoEntity$$serializer, recentStopInfoEntity$$serializer, lazyArr[7].getValue(), LongSerializer.f18151a, IntSerializer.f18146a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        ChaloTransitMode chaloTransitMode;
        RecentStopInfoEntity recentStopInfoEntity;
        RecentStopInfoEntity recentStopInfoEntity2;
        RecentAdditionalRouteInfoEntity recentAdditionalRouteInfoEntity;
        int i;
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        char c;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RecentStopAndRouteBasedTripEntity.k;
        int i2 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            RecentAdditionalRouteInfoEntity recentAdditionalRouteInfoEntity2 = (RecentAdditionalRouteInfoEntity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, RecentAdditionalRouteInfoEntityTypeDeserializer.c, null);
            RecentStopInfoEntity$$serializer recentStopInfoEntity$$serializer = RecentStopInfoEntity$$serializer.f8948a;
            RecentStopInfoEntity recentStopInfoEntity3 = (RecentStopInfoEntity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, recentStopInfoEntity$$serializer, null);
            RecentStopInfoEntity recentStopInfoEntity4 = (RecentStopInfoEntity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, recentStopInfoEntity$$serializer, null);
            ChaloTransitMode chaloTransitMode2 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            chaloTransitMode = chaloTransitMode2;
            str = strDecodeStringElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            recentStopInfoEntity = recentStopInfoEntity4;
            recentStopInfoEntity2 = recentStopInfoEntity3;
            str4 = strDecodeStringElement4;
            i = 1023;
            recentAdditionalRouteInfoEntity = recentAdditionalRouteInfoEntity2;
            str3 = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            j = jDecodeLongElement;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            int iDecodeIntElement2 = 0;
            ChaloTransitMode chaloTransitMode3 = null;
            RecentStopInfoEntity recentStopInfoEntity5 = null;
            RecentStopInfoEntity recentStopInfoEntity6 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int i3 = 0;
            RecentAdditionalRouteInfoEntity recentAdditionalRouteInfoEntity3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        break;
                    case 0:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 9;
                        break;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 9;
                        break;
                    case 2:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 9;
                        break;
                    case 3:
                        c = 4;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 9;
                        break;
                    case 4:
                        c = 4;
                        recentAdditionalRouteInfoEntity3 = (RecentAdditionalRouteInfoEntity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, RecentAdditionalRouteInfoEntityTypeDeserializer.c, recentAdditionalRouteInfoEntity3);
                        i3 |= 16;
                        i2 = 9;
                        break;
                    case 5:
                        recentStopInfoEntity6 = (RecentStopInfoEntity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, RecentStopInfoEntity$$serializer.f8948a, recentStopInfoEntity6);
                        i3 |= 32;
                        break;
                    case 6:
                        recentStopInfoEntity5 = (RecentStopInfoEntity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, RecentStopInfoEntity$$serializer.f8948a, recentStopInfoEntity5);
                        i3 |= 64;
                        break;
                    case 7:
                        chaloTransitMode3 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), chaloTransitMode3);
                        i3 |= 128;
                        break;
                    case 8:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i3 |= 256;
                        break;
                    case 9:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i2);
                        i3 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            chaloTransitMode = chaloTransitMode3;
            recentStopInfoEntity = recentStopInfoEntity5;
            recentStopInfoEntity2 = recentStopInfoEntity6;
            recentAdditionalRouteInfoEntity = recentAdditionalRouteInfoEntity3;
            i = i3;
            j = jDecodeLongElement2;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecentStopAndRouteBasedTripEntity(i, str, str2, str3, str4, recentAdditionalRouteInfoEntity, recentStopInfoEntity2, recentStopInfoEntity, chaloTransitMode, j, iDecodeIntElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RecentStopAndRouteBasedTripEntity value = (RecentStopAndRouteBasedTripEntity) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RecentStopAndRouteBasedTripEntity.k;
        String str = value.f8943a;
        int i = value.j;
        long j = value.i;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, RecentAdditionalRouteInfoEntityTypeDeserializer.c, value.e);
        RecentStopInfoEntity$$serializer recentStopInfoEntity$$serializer = RecentStopInfoEntity$$serializer.f8948a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, recentStopInfoEntity$$serializer, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, recentStopInfoEntity$$serializer, value.g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), value.h);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || j != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 8, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 9, i);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
