package app.chalo.tripreceipt.data;

import androidx.autofill.HintConstants;
import app.chalo.models.EpochTimeAndZone;
import app.chalo.models.EpochTimeAndZone$$serializer;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.userprofile.Gender;
import java.util.Map;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/tripreceipt/data/TripReceiptDataAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/tripreceipt/data/TripReceiptDataAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TripReceiptDataAppModel$$serializer implements GeneratedSerializer<TripReceiptDataAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TripReceiptDataAppModel$$serializer f9733a;
    private static final SerialDescriptor descriptor;

    static {
        TripReceiptDataAppModel$$serializer tripReceiptDataAppModel$$serializer = new TripReceiptDataAppModel$$serializer();
        f9733a = tripReceiptDataAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.tripreceipt.data.TripReceiptDataAppModel", tripReceiptDataAppModel$$serializer, 18);
        pluginGeneratedSerialDescriptor.j("validationProduct", false);
        pluginGeneratedSerialDescriptor.j("activationTime", false);
        pluginGeneratedSerialDescriptor.j("punchTime", false);
        pluginGeneratedSerialDescriptor.j("fullName", false);
        pluginGeneratedSerialDescriptor.j("dob", false);
        pluginGeneratedSerialDescriptor.j(HintConstants.AUTOFILL_HINT_GENDER, false);
        pluginGeneratedSerialDescriptor.j("profileImageUrl", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("startStop", false);
        pluginGeneratedSerialDescriptor.j("endStop", false);
        pluginGeneratedSerialDescriptor.j("amountInSubcurrency", false);
        pluginGeneratedSerialDescriptor.j("amountString", false);
        pluginGeneratedSerialDescriptor.j("conductorId", false);
        pluginGeneratedSerialDescriptor.j("vehicleNumber", false);
        pluginGeneratedSerialDescriptor.j("paymentMode", false);
        pluginGeneratedSerialDescriptor.j("passengerCountDetails", true);
        pluginGeneratedSerialDescriptor.j("routeNamingSchemeType", true);
        pluginGeneratedSerialDescriptor.j("via", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TripReceiptDataAppModel.s;
        EpochTimeAndZone$$serializer epochTimeAndZone$$serializer = EpochTimeAndZone$$serializer.f5583a;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{lazyArr[0].getValue(), BuiltinSerializersKt.c(epochTimeAndZone$$serializer), BuiltinSerializersKt.c(epochTimeAndZone$$serializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(LongSerializer.f18151a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[15].getValue()), lazyArr[16].getValue(), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        ValidationProduct validationProduct;
        String str2;
        String str3;
        RouteNamingSchemeType routeNamingSchemeType;
        String str4;
        Map map;
        String str5;
        Long l;
        String str6;
        String str7;
        String str8;
        EpochTimeAndZone epochTimeAndZone;
        EpochTimeAndZone epochTimeAndZone2;
        String str9;
        String str10;
        Gender gender;
        String str11;
        int i;
        int i2;
        Gender gender2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TripReceiptDataAppModel.s;
        String str12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ValidationProduct validationProduct2 = (ValidationProduct) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            EpochTimeAndZone$$serializer epochTimeAndZone$$serializer = EpochTimeAndZone$$serializer.f5583a;
            EpochTimeAndZone epochTimeAndZone3 = (EpochTimeAndZone) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, epochTimeAndZone$$serializer, null);
            EpochTimeAndZone epochTimeAndZone4 = (EpochTimeAndZone) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, epochTimeAndZone$$serializer, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Gender gender3 = (Gender) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.f18151a, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), null);
            routeNamingSchemeType = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, (DeserializationStrategy) lazyArr[16].getValue(), null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            epochTimeAndZone2 = epochTimeAndZone4;
            gender = gender3;
            epochTimeAndZone = epochTimeAndZone3;
            i = 262143;
            str7 = str15;
            str6 = str18;
            str8 = str16;
            str2 = str17;
            str9 = str13;
            str10 = str14;
            validationProduct = validationProduct2;
            map = map2;
            str4 = str20;
            str5 = str19;
            l = l2;
            str11 = str21;
        } else {
            int i3 = 5;
            int i4 = 1;
            int i5 = 0;
            int i6 = 0;
            String str22 = null;
            Gender gender4 = null;
            String str23 = null;
            String str24 = null;
            RouteNamingSchemeType routeNamingSchemeType2 = null;
            Map map3 = null;
            String str25 = null;
            Long l3 = null;
            String str26 = null;
            String str27 = null;
            str = null;
            String str28 = null;
            ValidationProduct validationProduct3 = null;
            EpochTimeAndZone epochTimeAndZone5 = null;
            EpochTimeAndZone epochTimeAndZone6 = null;
            String str29 = null;
            String str30 = null;
            while (i4 != 0) {
                Gender gender5 = gender4;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i4 = i6;
                        gender4 = gender5;
                        str22 = str22;
                        i3 = 5;
                        i6 = i4;
                        i5 = i5;
                        break;
                    case 0:
                        str22 = str22;
                        int i7 = i6;
                        validationProduct3 = (ValidationProduct) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, (DeserializationStrategy) lazyArr[i6].getValue(), validationProduct3);
                        epochTimeAndZone5 = epochTimeAndZone5;
                        gender4 = gender5;
                        i6 = i7;
                        i5 |= 1;
                        str22 = str22;
                        i3 = 5;
                        break;
                    case 1:
                        gender2 = gender5;
                        epochTimeAndZone5 = (EpochTimeAndZone) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, EpochTimeAndZone$$serializer.f5583a, epochTimeAndZone5);
                        i5 |= 2;
                        epochTimeAndZone6 = epochTimeAndZone6;
                        gender4 = gender2;
                        str22 = str22;
                        i3 = 5;
                        break;
                    case 2:
                        gender2 = gender5;
                        epochTimeAndZone6 = (EpochTimeAndZone) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, EpochTimeAndZone$$serializer.f5583a, epochTimeAndZone6);
                        i5 |= 4;
                        str29 = str29;
                        gender4 = gender2;
                        str22 = str22;
                        i3 = 5;
                        break;
                    case 3:
                        gender2 = gender5;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str29);
                        i5 |= 8;
                        str30 = str30;
                        gender4 = gender2;
                        str22 = str22;
                        i3 = 5;
                        break;
                    case 4:
                        gender2 = gender5;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str30);
                        i5 |= 16;
                        gender4 = gender2;
                        str22 = str22;
                        i3 = 5;
                        break;
                    case 5:
                        int i8 = i5;
                        DeserializationStrategy deserializationStrategy = (DeserializationStrategy) lazyArr[i3].getValue();
                        int i9 = i3;
                        gender4 = (Gender) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i9, deserializationStrategy, gender5);
                        i5 = i8 | 32;
                        i3 = i9;
                        str22 = str22;
                        break;
                    case 6:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str27);
                        i5 |= 64;
                        gender4 = gender5;
                        break;
                    case 7:
                        str27 = str27;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str28);
                        i5 |= 128;
                        gender4 = gender5;
                        str27 = str27;
                        break;
                    case 8:
                        str27 = str27;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str23);
                        i5 |= 256;
                        gender4 = gender5;
                        str27 = str27;
                        break;
                    case 9:
                        str27 = str27;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str26);
                        i5 |= 512;
                        gender4 = gender5;
                        str27 = str27;
                        break;
                    case 10:
                        str27 = str27;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.f18151a, l3);
                        i5 |= 1024;
                        gender4 = gender5;
                        str27 = str27;
                        break;
                    case 11:
                        str27 = str27;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str);
                        i5 |= 2048;
                        gender4 = gender5;
                        str27 = str27;
                        break;
                    case 12:
                        str27 = str27;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str25);
                        i5 |= 4096;
                        gender4 = gender5;
                        str27 = str27;
                        break;
                    case 13:
                        str27 = str27;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str12);
                        i5 |= 8192;
                        gender4 = gender5;
                        str27 = str27;
                        break;
                    case 14:
                        str27 = str27;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str22);
                        i5 |= 16384;
                        gender4 = gender5;
                        str27 = str27;
                        break;
                    case 15:
                        map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), map3);
                        i2 = 32768;
                        i5 |= i2;
                        gender4 = gender5;
                        str27 = str27;
                        break;
                    case 16:
                        str27 = str27;
                        routeNamingSchemeType2 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, (DeserializationStrategy) lazyArr[16].getValue(), routeNamingSchemeType2);
                        i5 |= 65536;
                        gender4 = gender5;
                        str27 = str27;
                        break;
                    case 17:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str24);
                        i2 = 131072;
                        i5 |= i2;
                        gender4 = gender5;
                        str27 = str27;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            validationProduct = validationProduct3;
            str2 = str23;
            str3 = str24;
            routeNamingSchemeType = routeNamingSchemeType2;
            str4 = str12;
            map = map3;
            str5 = str25;
            l = l3;
            str6 = str26;
            str7 = str27;
            str8 = str28;
            epochTimeAndZone = epochTimeAndZone5;
            epochTimeAndZone2 = epochTimeAndZone6;
            str9 = str29;
            str10 = str30;
            gender = gender4;
            str11 = str22;
            i = i5;
        }
        String str31 = str;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TripReceiptDataAppModel(i, validationProduct, epochTimeAndZone, epochTimeAndZone2, str9, str10, gender, str7, str8, str2, str6, l, str31, str5, str4, str11, map, routeNamingSchemeType, str3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TripReceiptDataAppModel value = (TripReceiptDataAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TripReceiptDataAppModel.s;
        SerializationStrategy serializationStrategy = (SerializationStrategy) lazyArr[0].getValue();
        ValidationProduct validationProduct = value.f9732a;
        RouteNamingSchemeType routeNamingSchemeType = value.q;
        Map map = value.p;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, validationProduct);
        EpochTimeAndZone$$serializer epochTimeAndZone$$serializer = EpochTimeAndZone$$serializer.f5583a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, epochTimeAndZone$$serializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, epochTimeAndZone$$serializer, value.c);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.f18151a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, value.o);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || map != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), map);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16) || routeNamingSchemeType != RouteNamingSchemeType.DEFAULT) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 16, (SerializationStrategy) lazyArr[16].getValue(), routeNamingSchemeType);
        }
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, value.r);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
