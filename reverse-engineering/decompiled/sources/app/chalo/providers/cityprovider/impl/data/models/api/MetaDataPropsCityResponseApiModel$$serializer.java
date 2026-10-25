package app.chalo.providers.cityprovider.impl.data.models.api;

import app.chalo.constants.AppConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/providers/cityprovider/impl/data/models/api/MetaDataPropsCityResponseApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataPropsCityResponseApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MetaDataPropsCityResponseApiModel$$serializer implements GeneratedSerializer<MetaDataPropsCityResponseApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MetaDataPropsCityResponseApiModel$$serializer f8849a;
    private static final SerialDescriptor descriptor;

    static {
        MetaDataPropsCityResponseApiModel$$serializer metaDataPropsCityResponseApiModel$$serializer = new MetaDataPropsCityResponseApiModel$$serializer();
        f8849a = metaDataPropsCityResponseApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.providers.cityprovider.impl.data.models.api.MetaDataPropsCityResponseApiModel", metaDataPropsCityResponseApiModel$$serializer, 23);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("city_display_name", false);
        pluginGeneratedSerialDescriptor.j("bound", false);
        pluginGeneratedSerialDescriptor.j("cityCentre", false);
        pluginGeneratedSerialDescriptor.j("station_type", false);
        pluginGeneratedSerialDescriptor.j("line_maps", false);
        pluginGeneratedSerialDescriptor.j("bus_maps_url", false);
        pluginGeneratedSerialDescriptor.j("beta_mode", true);
        pluginGeneratedSerialDescriptor.j("isComingSoon", true);
        pluginGeneratedSerialDescriptor.j("isDisabled", true);
        pluginGeneratedSerialDescriptor.j("tz", true);
        pluginGeneratedSerialDescriptor.j("minAppVersionForLogin", true);
        pluginGeneratedSerialDescriptor.j("countryId", true);
        pluginGeneratedSerialDescriptor.j("countryName", true);
        pluginGeneratedSerialDescriptor.j("countryCallingCode", true);
        pluginGeneratedSerialDescriptor.j("phoneNumberPossibleLengths", true);
        pluginGeneratedSerialDescriptor.j(FirebaseAnalytics.Param.CURRENCY, true);
        pluginGeneratedSerialDescriptor.j("currencySymbol", true);
        pluginGeneratedSerialDescriptor.j("currencyFactor", true);
        pluginGeneratedSerialDescriptor.j("chaloBaseDomain", true);
        pluginGeneratedSerialDescriptor.j("modes_map", true);
        pluginGeneratedSerialDescriptor.j("polyBound", true);
        pluginGeneratedSerialDescriptor.j("isMultiModalGroupTicketingEnabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MetaDataPropsCityResponseApiModel.x;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(MetaDataCityBoundsResponseApiModel$$serializer.f8841a), BuiltinSerializersKt.c(MetaDataCityCenterBoundResponseApiModel$$serializer.f8843a), BuiltinSerializersKt.c((KSerializer) lazyArr[4].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue()), BuiltinSerializersKt.c(stringSerializer), booleanSerializer, booleanSerializer, booleanSerializer, stringSerializer, IntSerializer.f18146a, stringSerializer, stringSerializer, stringSerializer, lazyArr[15].getValue(), stringSerializer, stringSerializer, LongSerializer.f18151a, stringSerializer, BuiltinSerializersKt.c((KSerializer) lazyArr[20].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[21].getValue()), booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        List list;
        String str;
        List list2;
        MetaDataCityCenterBoundResponseApiModel metaDataCityCenterBoundResponseApiModel;
        List list3;
        boolean zDecodeBooleanElement;
        String str2;
        boolean z;
        int i;
        String str3;
        List list4;
        List list5;
        MetaDataCityBoundsResponseApiModel metaDataCityBoundsResponseApiModel;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z2;
        boolean z3;
        int i2;
        long j;
        int i3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MetaDataPropsCityResponseApiModel.x;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            MetaDataCityBoundsResponseApiModel metaDataCityBoundsResponseApiModel2 = (MetaDataCityBoundsResponseApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, MetaDataCityBoundsResponseApiModel$$serializer.f8841a, null);
            MetaDataCityCenterBoundResponseApiModel metaDataCityCenterBoundResponseApiModel2 = (MetaDataCityCenterBoundResponseApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, MetaDataCityCenterBoundResponseApiModel$$serializer.f8843a, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            List list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 18);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            List list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, (DeserializationStrategy) lazyArr[21].getValue(), null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 22);
            metaDataCityCenterBoundResponseApiModel = metaDataCityCenterBoundResponseApiModel2;
            list3 = list7;
            z = zDecodeBooleanElement3;
            metaDataCityBoundsResponseApiModel = metaDataCityBoundsResponseApiModel2;
            list = list6;
            i = 8388607;
            str9 = strDecodeStringElement6;
            str5 = strDecodeStringElement2;
            z2 = zDecodeBooleanElement2;
            z3 = zDecodeBooleanElement4;
            str4 = strDecodeStringElement;
            i2 = iDecodeIntElement;
            str8 = strDecodeStringElement5;
            str10 = strDecodeStringElement7;
            list5 = list8;
            str2 = str12;
            list4 = list9;
            str3 = str11;
            str = str13;
            str6 = strDecodeStringElement3;
            str7 = strDecodeStringElement4;
            j = jDecodeLongElement;
        } else {
            int i4 = 22;
            boolean z4 = true;
            int i5 = 5;
            int i6 = 4;
            MetaDataCityBoundsResponseApiModel metaDataCityBoundsResponseApiModel3 = null;
            List list10 = null;
            String str14 = null;
            List list11 = null;
            MetaDataCityCenterBoundResponseApiModel metaDataCityCenterBoundResponseApiModel3 = null;
            List list12 = null;
            List list13 = null;
            List list14 = null;
            String str15 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement2 = 0;
            long jDecodeLongElement2 = 0;
            String str16 = null;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            int i7 = 0;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        metaDataCityBoundsResponseApiModel3 = metaDataCityBoundsResponseApiModel3;
                        i6 = 4;
                        i5 = 5;
                        break;
                    case 0:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str15);
                        i7 |= 1;
                        metaDataCityBoundsResponseApiModel3 = metaDataCityBoundsResponseApiModel3;
                        i4 = 22;
                        i6 = 4;
                        i5 = 5;
                        break;
                    case 1:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str16);
                        i7 |= 2;
                        i4 = 22;
                        i6 = 4;
                        i5 = 5;
                        break;
                    case 2:
                        metaDataCityBoundsResponseApiModel3 = (MetaDataCityBoundsResponseApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, MetaDataCityBoundsResponseApiModel$$serializer.f8841a, metaDataCityBoundsResponseApiModel3);
                        i7 |= 4;
                        i4 = 22;
                        i6 = 4;
                        i5 = 5;
                        break;
                    case 3:
                        metaDataCityCenterBoundResponseApiModel3 = (MetaDataCityCenterBoundResponseApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, MetaDataCityCenterBoundResponseApiModel$$serializer.f8843a, metaDataCityCenterBoundResponseApiModel3);
                        i7 |= 8;
                        i4 = 22;
                        i6 = 4;
                        i5 = 5;
                        break;
                    case 4:
                        list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), list10);
                        i7 |= 16;
                        i4 = 22;
                        i5 = 5;
                        break;
                    case 5:
                        list12 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), list12);
                        i7 |= 32;
                        i4 = 22;
                        break;
                    case 6:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str14);
                        i7 |= 64;
                        i4 = 22;
                        break;
                    case 7:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i7 |= 128;
                        i4 = 22;
                        break;
                    case 8:
                        i7 |= 256;
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i4 = 22;
                        break;
                    case 9:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i7 |= 512;
                        i4 = 22;
                        break;
                    case 10:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i7 |= 1024;
                        i4 = 22;
                        break;
                    case 11:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
                        i7 |= 2048;
                        i4 = 22;
                        break;
                    case 12:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i7 |= 4096;
                        i4 = 22;
                        break;
                    case 13:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i7 |= 8192;
                        i4 = 22;
                        break;
                    case 14:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i7 |= 16384;
                        i4 = 22;
                        break;
                    case 15:
                        list14 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), list14);
                        i3 = 32768;
                        i7 |= i3;
                        i4 = 22;
                        break;
                    case 16:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i7 |= 65536;
                        i4 = 22;
                        break;
                    case 17:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i7 |= 131072;
                        i4 = 22;
                        break;
                    case 18:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 18);
                        i7 |= 262144;
                        i4 = 22;
                        break;
                    case 19:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i7 |= 524288;
                        i4 = 22;
                        break;
                    case 20:
                        list13 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), list13);
                        i3 = 1048576;
                        i7 |= i3;
                        i4 = 22;
                        break;
                    case 21:
                        list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, (DeserializationStrategy) lazyArr[21].getValue(), list11);
                        i7 |= 2097152;
                        i4 = 22;
                        break;
                    case 22:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i7 |= 4194304;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list10;
            str = str14;
            list2 = list11;
            metaDataCityCenterBoundResponseApiModel = metaDataCityCenterBoundResponseApiModel3;
            list3 = list12;
            zDecodeBooleanElement = zDecodeBooleanElement7;
            str2 = str16;
            z = zDecodeBooleanElement8;
            i = i7;
            str3 = str15;
            list4 = list13;
            list5 = list14;
            metaDataCityBoundsResponseApiModel = metaDataCityBoundsResponseApiModel3;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement9;
            str6 = strDecodeStringElement10;
            str7 = strDecodeStringElement11;
            str8 = strDecodeStringElement12;
            str9 = strDecodeStringElement13;
            str10 = strDecodeStringElement14;
            z2 = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement6;
            i2 = iDecodeIntElement2;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MetaDataPropsCityResponseApiModel(i, str3, str2, metaDataCityBoundsResponseApiModel, metaDataCityCenterBoundResponseApiModel, list, list3, str, z2, z, z3, str4, i2, str5, str6, str7, list5, str8, str9, j, str10, list4, list2, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    /* JADX WARN: Code duplicated, block: B:73:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0190  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c0 A[ADDED_TO_REGION] */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        String str;
        String str2;
        String str3;
        MetaDataPropsCityResponseApiModel value = (MetaDataPropsCityResponseApiModel) obj;
        Intrinsics.i(value, "value");
        boolean z = value.w;
        List list = value.v;
        List list2 = value.u;
        String str4 = value.t;
        long j = value.s;
        String str5 = value.r;
        String str6 = value.q;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MetaDataPropsCityResponseApiModel.x;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        String str7 = value.f8848a;
        List list3 = value.p;
        String str8 = value.o;
        String str9 = value.n;
        String str10 = value.m;
        int i = value.l;
        String str11 = value.k;
        boolean z2 = value.j;
        boolean z3 = value.i;
        boolean z4 = value.h;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, str7);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, MetaDataCityBoundsResponseApiModel$$serializer.f8841a, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, MetaDataCityCenterBoundResponseApiModel$$serializer.f8843a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, z4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 9, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.d(str11, "Asia/Kolkata")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, str11);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 11, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.d(str10, "IND")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 12, str10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.d(str9, "India")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 13, str9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.d(str8, "+91")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 14, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.d(list3, AppConstants.f1940a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), list3);
        }
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16)) {
            str = str6;
            if (!Intrinsics.d(str, "INR")) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17)) {
                str2 = str5;
                if (!Intrinsics.d(str2, "₹")) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18) || j != 100) {
                    compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 18, j);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                    str3 = str4;
                    if (!Intrinsics.d(str3, "")) {
                    }
                    if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20) || list2 != null) {
                        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
                    }
                    if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21) || list != null) {
                        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
                    }
                    if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22) || z) {
                        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
                    }
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                str3 = str4;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 19, str3);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
                } else {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
                } else {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
                } else {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str2 = str5;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 17, str2);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
                compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 18, j);
            } else {
                compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 18, j);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                str3 = str4;
                if (!Intrinsics.d(str3, "")) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
                } else {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
                } else {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
                } else {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str3 = str4;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 19, str3);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
            } else {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        str = str6;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 16, str);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17)) {
            str2 = str5;
            if (!Intrinsics.d(str2, "₹")) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
                compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 18, j);
            } else {
                compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 18, j);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                str3 = str4;
                if (!Intrinsics.d(str3, "")) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
                } else {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
                } else {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
                } else {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str3 = str4;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 19, str3);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
            } else {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        str2 = str5;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 17, str2);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 18, j);
        } else {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 18, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
            str3 = str4;
            if (!Intrinsics.d(str3, "")) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
            } else {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        str3 = str4;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 19, str3);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
        } else {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 22, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
