package app.chalo.data;

import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/data/MiscellaneousCityWiseConfigForCity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/data/MiscellaneousCityWiseConfigForCity;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MiscellaneousCityWiseConfigForCity$$serializer implements GeneratedSerializer<MiscellaneousCityWiseConfigForCity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MiscellaneousCityWiseConfigForCity$$serializer f2361a;
    private static final SerialDescriptor descriptor;

    static {
        MiscellaneousCityWiseConfigForCity$$serializer miscellaneousCityWiseConfigForCity$$serializer = new MiscellaneousCityWiseConfigForCity$$serializer();
        f2361a = miscellaneousCityWiseConfigForCity$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.data.MiscellaneousCityWiseConfigForCity", miscellaneousCityWiseConfigForCity$$serializer, 20);
        pluginGeneratedSerialDescriptor.j("cityName", true);
        pluginGeneratedSerialDescriptor.j("bonnetNumberToggle", true);
        pluginGeneratedSerialDescriptor.j("locationManagerToggle", true);
        pluginGeneratedSerialDescriptor.j("enableNativeInlineAdPrefetch", true);
        pluginGeneratedSerialDescriptor.j("passConfigIdsForAdjustEvent", true);
        pluginGeneratedSerialDescriptor.j("swipeToProceedButtonSuccessPercentage", true);
        pluginGeneratedSerialDescriptor.j("adjustCampaignIdsForUniversalSearch", true);
        pluginGeneratedSerialDescriptor.j("premiumBusFirstRideOffer", true);
        pluginGeneratedSerialDescriptor.j("pbDaysAllowedToBookTicket", true);
        pluginGeneratedSerialDescriptor.j("passConfigIdsForBulkBookingFlowV2", true);
        pluginGeneratedSerialDescriptor.j("adjustCampaignsForPB", true);
        pluginGeneratedSerialDescriptor.j("askNotificationPermissionAfterSessionCount", true);
        pluginGeneratedSerialDescriptor.j("shouldShowOtherCardOptions", true);
        pluginGeneratedSerialDescriptor.j("shouldDisablePBBoardingLastCrossStop", true);
        pluginGeneratedSerialDescriptor.j("shouldDisablePBDistToBoardingStop", true);
        pluginGeneratedSerialDescriptor.j("pbShowTrafficSignalThresholdDist", true);
        pluginGeneratedSerialDescriptor.j("passRollOverRidesConfig", true);
        pluginGeneratedSerialDescriptor.j("userAccountDeletionUrl", true);
        pluginGeneratedSerialDescriptor.j("userConsentConfig", true);
        pluginGeneratedSerialDescriptor.j("shouldLaunchInAppReview", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MiscellaneousCityWiseConfigForCity.u;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{stringSerializer, BonnetNumberToggleConfig$$serializer.f2316a, LocationManagerToggleConfig$$serializer.f2357a, booleanSerializer, lazyArr[4].getValue(), DoubleSerializer.f18137a, lazyArr[6].getValue(), BuiltinSerializersKt.c(stringSerializer), intSerializer, lazyArr[9].getValue(), lazyArr[10].getValue(), intSerializer, booleanSerializer, booleanSerializer, booleanSerializer, intSerializer, PassRollOverRidesConfig$$serializer.f2368a, BuiltinSerializersKt.c(stringSerializer), UserConsentConfig$$serializer.f2409a, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        List list;
        BonnetNumberToggleConfig bonnetNumberToggleConfig;
        Map map;
        String str2;
        LocationManagerToggleConfig locationManagerToggleConfig;
        boolean z;
        int i2;
        PassRollOverRidesConfig passRollOverRidesConfig;
        List list2;
        List list3;
        UserConsentConfig userConsentConfig;
        int i3;
        boolean zDecodeBooleanElement;
        boolean z2;
        String str3;
        boolean z3;
        double d;
        int i4;
        boolean z4;
        int i5;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MiscellaneousCityWiseConfigForCity.u;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            BonnetNumberToggleConfig bonnetNumberToggleConfig2 = (BonnetNumberToggleConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, BonnetNumberToggleConfig$$serializer.f2316a, null);
            LocationManagerToggleConfig locationManagerToggleConfig2 = (LocationManagerToggleConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, LocationManagerToggleConfig$$serializer.f2357a, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
            PassRollOverRidesConfig passRollOverRidesConfig2 = (PassRollOverRidesConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, PassRollOverRidesConfig$$serializer.f2368a, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            userConsentConfig = (UserConsentConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, UserConsentConfig$$serializer.f2409a, null);
            str = str5;
            i3 = iDecodeIntElement;
            locationManagerToggleConfig = locationManagerToggleConfig2;
            list3 = list5;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
            list = list4;
            bonnetNumberToggleConfig = bonnetNumberToggleConfig2;
            i = 1048575;
            z3 = zDecodeBooleanElement3;
            str2 = str4;
            d = dDecodeDoubleElement;
            i4 = iDecodeIntElement2;
            passRollOverRidesConfig = passRollOverRidesConfig2;
            z2 = zDecodeBooleanElement2;
            i2 = iDecodeIntElement3;
            z = zDecodeBooleanElement5;
            z4 = zDecodeBooleanElement4;
            map = map2;
            str3 = strDecodeStringElement;
            list2 = list6;
        } else {
            int i6 = 0;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            int iDecodeIntElement6 = 0;
            int i7 = 6;
            int i8 = 4;
            boolean z5 = true;
            String str6 = null;
            List list7 = null;
            Map map3 = null;
            String str7 = null;
            LocationManagerToggleConfig locationManagerToggleConfig3 = null;
            PassRollOverRidesConfig passRollOverRidesConfig3 = null;
            List list8 = null;
            List list9 = null;
            String strDecodeStringElement2 = null;
            BonnetNumberToggleConfig bonnetNumberToggleConfig3 = null;
            int i9 = 9;
            double dDecodeDoubleElement2 = 0.0d;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            UserConsentConfig userConsentConfig2 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i6 = i6;
                        z5 = false;
                        i8 = 4;
                        i7 = 6;
                        i9 = 9;
                        break;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i8 = 4;
                        i7 = 6;
                        i9 = 9;
                        break;
                    case 1:
                        bonnetNumberToggleConfig3 = (BonnetNumberToggleConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, BonnetNumberToggleConfig$$serializer.f2316a, bonnetNumberToggleConfig3);
                        i6 |= 2;
                        i8 = 4;
                        i7 = 6;
                        i9 = 9;
                        break;
                    case 2:
                        locationManagerToggleConfig3 = (LocationManagerToggleConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, LocationManagerToggleConfig$$serializer.f2357a, locationManagerToggleConfig3);
                        i6 |= 4;
                        i8 = 4;
                        i7 = 6;
                        i9 = 9;
                        break;
                    case 3:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i6 |= 8;
                        i7 = 6;
                        i9 = 9;
                        break;
                    case 4:
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i8, (DeserializationStrategy) lazyArr[i8].getValue(), list7);
                        i6 |= 16;
                        i7 = 6;
                        i9 = 9;
                        break;
                    case 5:
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
                        i6 |= 32;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i9 = 9;
                        break;
                    case 6:
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, (DeserializationStrategy) lazyArr[i7].getValue(), list9);
                        i6 |= 64;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i9 = 9;
                        break;
                    case 7:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str7);
                        i6 |= 128;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i9 = 9;
                        break;
                    case 8:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i6 |= 256;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        break;
                    case 9:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i9, (DeserializationStrategy) lazyArr[i9].getValue(), list8);
                        i6 |= 512;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        break;
                    case 10:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), map3);
                        i6 |= 1024;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        break;
                    case 11:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
                        i6 |= 2048;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        break;
                    case 12:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i6 |= 4096;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        break;
                    case 13:
                        i6 |= 8192;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        break;
                    case 14:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i6 |= 16384;
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        break;
                    case 15:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
                        i6 |= 32768;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        break;
                    case 16:
                        passRollOverRidesConfig3 = (PassRollOverRidesConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, PassRollOverRidesConfig$$serializer.f2368a, passRollOverRidesConfig3);
                        i5 = 65536;
                        i6 |= i5;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        break;
                    case 17:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str6);
                        i5 = 131072;
                        i6 |= i5;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        break;
                    case 18:
                        userConsentConfig2 = (UserConsentConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, UserConsentConfig$$serializer.f2409a, userConsentConfig2);
                        i5 = 262144;
                        i6 |= i5;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        break;
                    case 19:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
                        i6 |= 524288;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i6;
            str = str6;
            list = list7;
            bonnetNumberToggleConfig = bonnetNumberToggleConfig3;
            map = map3;
            str2 = str7;
            locationManagerToggleConfig = locationManagerToggleConfig3;
            z = zDecodeBooleanElement9;
            i2 = iDecodeIntElement4;
            passRollOverRidesConfig = passRollOverRidesConfig3;
            list2 = list8;
            list3 = list9;
            userConsentConfig = userConsentConfig2;
            i3 = iDecodeIntElement5;
            zDecodeBooleanElement = zDecodeBooleanElement10;
            z2 = zDecodeBooleanElement7;
            str3 = strDecodeStringElement2;
            z3 = zDecodeBooleanElement8;
            d = dDecodeDoubleElement2;
            i4 = iDecodeIntElement6;
            z4 = zDecodeBooleanElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MiscellaneousCityWiseConfigForCity(i, str3, bonnetNumberToggleConfig, locationManagerToggleConfig, z2, list, d, list3, str2, i3, list2, map, i4, z3, z4, z, i2, passRollOverRidesConfig, str, userConsentConfig, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:14:0x0076  */
    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a5  */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        int i;
        PassRollOverRidesConfig passRollOverRidesConfig;
        UserConsentConfig userConsentConfig;
        MiscellaneousCityWiseConfigForCity value = (MiscellaneousCityWiseConfigForCity) obj;
        Intrinsics.i(value, "value");
        boolean z = value.t;
        UserConsentConfig userConsentConfig2 = value.s;
        String str = value.r;
        PassRollOverRidesConfig passRollOverRidesConfig2 = value.q;
        int i2 = value.p;
        boolean z2 = value.o;
        boolean z3 = value.n;
        boolean z4 = value.m;
        int i3 = value.l;
        Map map = value.k;
        List list = value.j;
        int i4 = value.i;
        String str2 = value.h;
        List list2 = value.g;
        double d = value.f;
        List list3 = value.e;
        boolean z5 = value.d;
        LocationManagerToggleConfig locationManagerToggleConfig = value.c;
        BonnetNumberToggleConfig bonnetNumberToggleConfig = value.b;
        String str3 = value.f2360a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MiscellaneousCityWiseConfigForCity.u;
        int i5 = 0;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0)) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, i5, str3);
        } else if (!Intrinsics.d(str3, "")) {
            i5 = 0;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, i5, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, BonnetNumberToggleConfig$$serializer.f2316a, bonnetNumberToggleConfig);
        } else {
            BonnetNumberToggleConfig.INSTANCE.getClass();
            if (!Intrinsics.d(bonnetNumberToggleConfig, BonnetNumberToggleConfig.d)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, BonnetNumberToggleConfig$$serializer.f2316a, bonnetNumberToggleConfig);
            }
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, LocationManagerToggleConfig$$serializer.f2357a, locationManagerToggleConfig);
        } else {
            LocationManagerToggleConfig.INSTANCE.getClass();
            if (!Intrinsics.d(locationManagerToggleConfig, LocationManagerToggleConfig.d)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, LocationManagerToggleConfig$$serializer.f2357a, locationManagerToggleConfig);
            }
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || z5) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, z5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.d(list3, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), list3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || Double.compare(d, 0.8d) != 0) {
            compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 5, d);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(list2, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || i4 != 7) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 8, i4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.d(list, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.d(map, MapsKt.d())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), map);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || i3 != 1) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 11, i3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 12, z4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 13, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 14, z2);
        }
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15)) {
            i = i2;
            if (i != 200) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16)) {
                passRollOverRidesConfig = passRollOverRidesConfig2;
                if (!Intrinsics.d(passRollOverRidesConfig, new PassRollOverRidesConfig())) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || str != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
                    userConsentConfig = userConsentConfig2;
                    if (!Intrinsics.d(userConsentConfig, new UserConsentConfig())) {
                    }
                    if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19) || z) {
                        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
                    }
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                userConsentConfig = userConsentConfig2;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 18, UserConsentConfig$$serializer.f2409a, userConsentConfig);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
                } else {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            passRollOverRidesConfig = passRollOverRidesConfig2;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 16, PassRollOverRidesConfig$$serializer.f2368a, passRollOverRidesConfig);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
                userConsentConfig = userConsentConfig2;
                if (!Intrinsics.d(userConsentConfig, new UserConsentConfig())) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
                } else {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            userConsentConfig = userConsentConfig2;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 18, UserConsentConfig$$serializer.f2409a, userConsentConfig);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
            } else {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        i = i2;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 15, i);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16)) {
            passRollOverRidesConfig = passRollOverRidesConfig2;
            if (!Intrinsics.d(passRollOverRidesConfig, new PassRollOverRidesConfig())) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
                userConsentConfig = userConsentConfig2;
                if (!Intrinsics.d(userConsentConfig, new UserConsentConfig())) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
                } else {
                    compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            userConsentConfig = userConsentConfig2;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 18, UserConsentConfig$$serializer.f2409a, userConsentConfig);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
            } else {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        passRollOverRidesConfig = passRollOverRidesConfig2;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 16, PassRollOverRidesConfig$$serializer.f2368a, passRollOverRidesConfig);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
            userConsentConfig = userConsentConfig2;
            if (!Intrinsics.d(userConsentConfig, new UserConsentConfig())) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
            } else {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        userConsentConfig = userConsentConfig2;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 18, UserConsentConfig$$serializer.f2409a, userConsentConfig);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
        } else {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
