package app.chalo.instantticket.config.models;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/instantticket/config/models/InstantTicketConfiguration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/instantticket/config/models/InstantTicketConfiguration;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class InstantTicketConfiguration$$serializer implements GeneratedSerializer<InstantTicketConfiguration> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InstantTicketConfiguration$$serializer f3832a;
    private static final SerialDescriptor descriptor;

    static {
        InstantTicketConfiguration$$serializer instantTicketConfiguration$$serializer = new InstantTicketConfiguration$$serializer();
        f3832a = instantTicketConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.instantticket.config.models.InstantTicketConfiguration", instantTicketConfiguration$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("fareInfo", false);
        pluginGeneratedSerialDescriptor.j("activeDuration", false);
        pluginGeneratedSerialDescriptor.j("showOtherModes", false);
        pluginGeneratedSerialDescriptor.j("showFindMyFare", false);
        pluginGeneratedSerialDescriptor.j("productImageUrls", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = InstantTicketConfiguration.n;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, BrandingDetails$$serializer.f3828a, stringSerializer, stringSerializer, FareInfo$$serializer.f3830a, LongSerializer.f18151a, booleanSerializer, booleanSerializer, lazyArr[12].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String strDecodeStringElement;
        int i;
        List list;
        BrandingDetails brandingDetails;
        FareInfo fareInfo;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = InstantTicketConfiguration.n;
        int i2 = 10;
        int i3 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            BrandingDetails brandingDetails2 = (BrandingDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, BrandingDetails$$serializer.f3828a, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            FareInfo fareInfo2 = (FareInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, FareInfo$$serializer.f3830a, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            i = 8191;
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            z = zDecodeBooleanElement2;
            z2 = zDecodeBooleanElement3;
            str5 = strDecodeStringElement6;
            str4 = strDecodeStringElement5;
            brandingDetails = brandingDetails2;
            str3 = strDecodeStringElement4;
            fareInfo = fareInfo2;
            z3 = zDecodeBooleanElement;
            str2 = strDecodeStringElement3;
            str = strDecodeStringElement2;
            j = jDecodeLongElement;
        } else {
            strDecodeStringElement = null;
            List list2 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean z4 = true;
            long jDecodeLongElement2 = 0;
            BrandingDetails brandingDetails3 = null;
            FareInfo fareInfo3 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            i = 0;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i3 = 4;
                        break;
                    case 0:
                        i |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 10;
                        i3 = 4;
                        break;
                    case 1:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i2 = 10;
                        i3 = 4;
                        break;
                    case 2:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i2 = 10;
                        i3 = 4;
                        break;
                    case 3:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        i2 = 10;
                        i3 = 4;
                        break;
                    case 4:
                        int i4 = i3;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i |= 16;
                        i3 = i4;
                        i2 = 10;
                        break;
                    case 5:
                        brandingDetails3 = (BrandingDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, BrandingDetails$$serializer.f3828a, brandingDetails3);
                        i |= 32;
                        i2 = 10;
                        i3 = 4;
                        break;
                    case 6:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        i2 = 10;
                        i3 = 4;
                        break;
                    case 7:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        i2 = 10;
                        i3 = 4;
                        break;
                    case 8:
                        fareInfo3 = (FareInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, FareInfo$$serializer.f3830a, fareInfo3);
                        i |= 256;
                        i2 = 10;
                        i3 = 4;
                        break;
                    case 9:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
                        i |= 512;
                        i3 = 4;
                        break;
                    case 10:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i |= 1024;
                        i3 = 4;
                        break;
                    case 11:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i |= 2048;
                        i3 = 4;
                        break;
                    case 12:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), list2);
                        i |= 4096;
                        i3 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list2;
            brandingDetails = brandingDetails3;
            fareInfo = fareInfo3;
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement9;
            z = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement6;
            j = jDecodeLongElement2;
        }
        String str6 = strDecodeStringElement;
        int i5 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InstantTicketConfiguration(i5, str6, str, str2, str3, z3, brandingDetails, str4, str5, fareInfo, j, z, z2, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        InstantTicketConfiguration value = (InstantTicketConfiguration) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = InstantTicketConfiguration.n;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f3831a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, BrandingDetails$$serializer.f3828a, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, FareInfo$$serializer.f3830a, value.i);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 9, value.j);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 11, value.l);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), value.m);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
