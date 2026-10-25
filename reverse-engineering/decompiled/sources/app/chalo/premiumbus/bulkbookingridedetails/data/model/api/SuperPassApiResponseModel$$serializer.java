package app.chalo.premiumbus.bulkbookingridedetails.data.model.api;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/bulkbookingridedetails/data/model/api/SuperPassApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/SuperPassApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassApiResponseModel$$serializer implements GeneratedSerializer<SuperPassApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassApiResponseModel$$serializer f6883a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassApiResponseModel$$serializer superPassApiResponseModel$$serializer = new SuperPassApiResponseModel$$serializer();
        f6883a = superPassApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.bulkbookingridedetails.data.model.api.SuperPassApiResponseModel", superPassApiResponseModel$$serializer, 37);
        pluginGeneratedSerialDescriptor.j("passId", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("tone", false);
        pluginGeneratedSerialDescriptor.j("qrCode", false);
        pluginGeneratedSerialDescriptor.j("startTime", false);
        pluginGeneratedSerialDescriptor.j("expiryTime", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("numOfDays", false);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        pluginGeneratedSerialDescriptor.j("userProfile", false);
        pluginGeneratedSerialDescriptor.j("bookingTime", false);
        pluginGeneratedSerialDescriptor.j("fareInfo", false);
        pluginGeneratedSerialDescriptor.j("productName", false);
        pluginGeneratedSerialDescriptor.j("categoryName", false);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("displayName", false);
        pluginGeneratedSerialDescriptor.j("configurationId", false);
        pluginGeneratedSerialDescriptor.j("categoryId", false);
        pluginGeneratedSerialDescriptor.j("fmId", false);
        pluginGeneratedSerialDescriptor.j("verificationExpiryTime", false);
        pluginGeneratedSerialDescriptor.j("verificationFlag", false);
        pluginGeneratedSerialDescriptor.j("isRenewable", false);
        pluginGeneratedSerialDescriptor.j("transactionId", false);
        pluginGeneratedSerialDescriptor.j("paymentMode", false);
        pluginGeneratedSerialDescriptor.j("tripPreferences", false);
        pluginGeneratedSerialDescriptor.j("remainingTrips", false);
        pluginGeneratedSerialDescriptor.j("numOfTrips", false);
        pluginGeneratedSerialDescriptor.j("premiumRidesConsumed", false);
        pluginGeneratedSerialDescriptor.j("isHailingAllowed", false);
        pluginGeneratedSerialDescriptor.j("checkAppReclaim", false);
        pluginGeneratedSerialDescriptor.j("serviceType", false);
        pluginGeneratedSerialDescriptor.j("maxPricePerTrip", false);
        pluginGeneratedSerialDescriptor.j("maxTripsPerDay", false);
        pluginGeneratedSerialDescriptor.j("punches", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassApiResponseModel.L;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c(stringSerializer), stringSerializer, longSerializer, longSerializer, stringSerializer, intSerializer, lazyArr[11].getValue(), UserProfile$$serializer.f6889a, longSerializer, FareInfo$$serializer.f6877a, stringSerializer, stringSerializer, Branding$$serializer.f6873a, stringSerializer, stringSerializer, stringSerializer, intSerializer, longSerializer, booleanSerializer, booleanSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c(TripPreferencesApiResponseModel$$serializer.f6885a), intSerializer, intSerializer, intSerializer, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[33].getValue()), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[36].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Branding branding;
        UserProfile userProfile;
        Boolean bool;
        Integer num;
        FareInfo fareInfo;
        List list;
        List list2;
        String str;
        Integer num2;
        List list3;
        Boolean bool2;
        TripPreferencesApiResponseModel tripPreferencesApiResponseModel;
        int i;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i3;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        int i4;
        boolean z;
        int i5;
        int i6;
        long j;
        long j2;
        long j3;
        long j4;
        int i7;
        boolean z2;
        String str16;
        int i8;
        int i9;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassApiResponseModel.L;
        boolean z3 = false;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), null);
            UserProfile userProfile2 = (UserProfile) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, UserProfile$$serializer.f6889a, null);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
            FareInfo fareInfo2 = (FareInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, FareInfo$$serializer.f6877a, null);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            Branding branding2 = (Branding) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, Branding$$serializer.f6873a, null);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 22);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            TripPreferencesApiResponseModel tripPreferencesApiResponseModel2 = (TripPreferencesApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 27, TripPreferencesApiResponseModel$$serializer.f6885a, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 28);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 29);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 30);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 31, booleanSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 32, booleanSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 33, (DeserializationStrategy) lazyArr[33].getValue(), null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 34, intSerializer, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 35, intSerializer, null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 36, (DeserializationStrategy) lazyArr[36].getValue(), null);
            i3 = -1;
            str12 = strDecodeStringElement11;
            str5 = strDecodeStringElement4;
            str8 = strDecodeStringElement7;
            str10 = strDecodeStringElement9;
            str6 = strDecodeStringElement5;
            str4 = strDecodeStringElement3;
            i5 = iDecodeIntElement4;
            i6 = iDecodeIntElement;
            str9 = strDecodeStringElement8;
            j = jDecodeLongElement;
            num2 = num3;
            i = iDecodeIntElement5;
            tripPreferencesApiResponseModel = tripPreferencesApiResponseModel2;
            i2 = iDecodeIntElement3;
            str7 = strDecodeStringElement6;
            str15 = strDecodeStringElement14;
            str14 = strDecodeStringElement13;
            z2 = zDecodeBooleanElement2;
            z = zDecodeBooleanElement;
            str11 = strDecodeStringElement10;
            i4 = iDecodeIntElement2;
            str13 = strDecodeStringElement12;
            branding = branding2;
            str3 = strDecodeStringElement2;
            bool = bool4;
            list3 = list5;
            str = str17;
            fareInfo = fareInfo2;
            str2 = strDecodeStringElement;
            bool2 = bool3;
            j2 = jDecodeLongElement3;
            list = list4;
            j3 = jDecodeLongElement2;
            userProfile = userProfile2;
            j4 = jDecodeLongElement4;
            i7 = 31;
        } else {
            int i10 = 0;
            List list6 = null;
            boolean z4 = true;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int i11 = 0;
            String str18 = null;
            Branding branding3 = null;
            UserProfile userProfile3 = null;
            Boolean bool5 = null;
            Integer num4 = null;
            FareInfo fareInfo3 = null;
            List list7 = null;
            Integer num5 = null;
            List list8 = null;
            Boolean bool6 = null;
            TripPreferencesApiResponseModel tripPreferencesApiResponseModel3 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String str19 = null;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            int iDecodeIntElement10 = 0;
            while (z4) {
                boolean zDecodeBooleanElement4 = z3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str16 = str18;
                        z4 = false;
                        i8 = i10;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 0:
                        str16 = str18;
                        i8 = i10 | 1;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 1:
                        str16 = str18;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i8 = i10 | 2;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 2:
                        str16 = str18;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i8 = i10 | 4;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 3:
                        str16 = str18;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i8 = i10 | 8;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 4:
                        str16 = str18;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i8 = i10 | 16;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 5:
                        i8 = i10 | 32;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str18);
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 6:
                        str18 = str18;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i10 |= 64;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 7:
                        str18 = str18;
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i10 |= 128;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 8:
                        str18 = str18;
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i10 |= 256;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 9:
                        str18 = str18;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i10 |= 512;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 10:
                        str18 = str18;
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i10 |= 1024;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 11:
                        str18 = str18;
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), list7);
                        i10 |= 2048;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 12:
                        str18 = str18;
                        i10 |= 4096;
                        userProfile3 = (UserProfile) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, UserProfile$$serializer.f6889a, userProfile3);
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 13:
                        str18 = str18;
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
                        i10 |= 8192;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 14:
                        str18 = str18;
                        i10 |= 16384;
                        fareInfo3 = (FareInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, FareInfo$$serializer.f6877a, fareInfo3);
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 15:
                        str18 = str18;
                        i8 = i10 | 32768;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 16:
                        str18 = str18;
                        i8 = i10 | 65536;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 17:
                        str18 = str18;
                        i10 |= 131072;
                        branding3 = (Branding) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, Branding$$serializer.f6873a, branding3);
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 18:
                        str18 = str18;
                        i8 = i10 | 262144;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 19:
                        str18 = str18;
                        i8 = i10 | 524288;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 20:
                        str18 = str18;
                        i8 = i10 | 1048576;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 21:
                        str18 = str18;
                        i8 = i10 | 2097152;
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 22:
                        str18 = str18;
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 22);
                        i10 |= 4194304;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 23:
                        str18 = str18;
                        i8 = i10 | 8388608;
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 24:
                        str18 = str18;
                        i8 = i10 | 16777216;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 25:
                        str18 = str18;
                        i8 = i10 | 33554432;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 26:
                        str18 = str18;
                        String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i8 = i10 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        str19 = strDecodeStringElement28;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 27:
                        str18 = str18;
                        TripPreferencesApiResponseModel tripPreferencesApiResponseModel4 = (TripPreferencesApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 27, TripPreferencesApiResponseModel$$serializer.f6885a, tripPreferencesApiResponseModel3);
                        i10 |= C.BUFFER_FLAG_FIRST_SAMPLE;
                        tripPreferencesApiResponseModel3 = tripPreferencesApiResponseModel4;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 28:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 28);
                        i9 = 268435456;
                        i10 |= i9;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 29:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 29);
                        i9 = 536870912;
                        i10 |= i9;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 30:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 30);
                        i9 = 1073741824;
                        i10 |= i9;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 31:
                        str18 = str18;
                        i8 = i10 | Integer.MIN_VALUE;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 31, BooleanSerializer.f18123a, bool6);
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 32:
                        str18 = str18;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 32, BooleanSerializer.f18123a, bool5);
                        i11 |= 1;
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 33:
                        str18 = str18;
                        i11 |= 2;
                        i8 = i10;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 33, (DeserializationStrategy) lazyArr[33].getValue(), list8);
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 34:
                        str18 = str18;
                        i11 |= 4;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 34, IntSerializer.f18146a, num5);
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 35:
                        str18 = str18;
                        i11 |= 8;
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 35, IntSerializer.f18146a, num4);
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    case 36:
                        str18 = str18;
                        i11 |= 16;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 36, (DeserializationStrategy) lazyArr[36].getValue(), list6);
                        i8 = i10;
                        str16 = str18;
                        str18 = str16;
                        i10 = i8;
                        z3 = zDecodeBooleanElement4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            branding = branding3;
            userProfile = userProfile3;
            bool = bool5;
            num = num4;
            fareInfo = fareInfo3;
            list = list7;
            list2 = list6;
            str = str18;
            num2 = num5;
            list3 = list8;
            bool2 = bool6;
            tripPreferencesApiResponseModel = tripPreferencesApiResponseModel3;
            i = iDecodeIntElement10;
            i2 = iDecodeIntElement6;
            str2 = strDecodeStringElement15;
            str3 = strDecodeStringElement16;
            str4 = strDecodeStringElement17;
            str5 = strDecodeStringElement18;
            str6 = strDecodeStringElement19;
            str7 = strDecodeStringElement20;
            str8 = strDecodeStringElement21;
            str9 = strDecodeStringElement22;
            str10 = strDecodeStringElement23;
            i3 = i10;
            str11 = strDecodeStringElement24;
            str12 = strDecodeStringElement25;
            str13 = strDecodeStringElement26;
            str14 = strDecodeStringElement27;
            str15 = str19;
            i4 = iDecodeIntElement7;
            z = zDecodeBooleanElement3;
            i5 = iDecodeIntElement8;
            i6 = iDecodeIntElement9;
            j = jDecodeLongElement5;
            j2 = jDecodeLongElement6;
            j3 = jDecodeLongElement7;
            j4 = jDecodeLongElement8;
            i7 = i11;
            z2 = z3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassApiResponseModel(i3, i7, str2, str3, str4, str5, str6, str, str7, j, j3, str8, i6, list, userProfile, j2, fareInfo, str9, str10, branding, str11, str12, str13, i4, j4, z, z2, str14, str15, tripPreferencesApiResponseModel, i2, i5, i, bool2, bool, list3, num2, num, list2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassApiResponseModel value = (SuperPassApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassApiResponseModel.L;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f6882a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.j);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, (SerializationStrategy) lazyArr[11].getValue(), value.l);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, UserProfile$$serializer.f6889a, value.m);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 13, value.n);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 14, FareInfo$$serializer.f6877a, value.o);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 15, value.p);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 16, value.q);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 17, Branding$$serializer.f6873a, value.r);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 18, value.s);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 19, value.t);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 20, value.u);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 21, value.v);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 22, value.w);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 23, value.x);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 24, value.y);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 25, value.z);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 26, value.A);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 27, TripPreferencesApiResponseModel$$serializer.f6885a, value.B);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 28, value.C);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 29, value.D);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 30, value.E);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 31, booleanSerializer, value.F);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 32, booleanSerializer, value.G);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 33, (SerializationStrategy) lazyArr[33].getValue(), value.H);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 34, intSerializer, value.I);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 35, intSerializer, value.J);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 36, (SerializationStrategy) lazyArr[36].getValue(), value.K);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
