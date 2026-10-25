package app.chalo.productpurchase.passpurchase.ui;

import app.chalo.constants.Source;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.BookableSuperPassConfiguration$$serializer;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo$$serializer;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel$$serializer;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons$$serializer;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails$$serializer;
import app.chalo.userprofile.Gender;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedRestoredState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedRestoredState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassPurchaseSharedRestoredState$$serializer implements GeneratedSerializer<SuperPassPurchaseSharedRestoredState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassPurchaseSharedRestoredState$$serializer f8358a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassPurchaseSharedRestoredState$$serializer superPassPurchaseSharedRestoredState$$serializer = new SuperPassPurchaseSharedRestoredState$$serializer();
        f8358a = superPassPurchaseSharedRestoredState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedRestoredState", superPassPurchaseSharedRestoredState$$serializer, 16);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("agency", true);
        pluginGeneratedSerialDescriptor.j("purchaseFlowType", true);
        pluginGeneratedSerialDescriptor.j("passApplicationActionRequired", true);
        pluginGeneratedSerialDescriptor.j("passApplicationRejectionReasons", true);
        pluginGeneratedSerialDescriptor.j("passIdForRenew", true);
        pluginGeneratedSerialDescriptor.j("userDetails", true);
        pluginGeneratedSerialDescriptor.j("bookableSuperPassConfiguration", true);
        pluginGeneratedSerialDescriptor.j("passStartTime", true);
        pluginGeneratedSerialDescriptor.j("passVerificationExpiryTime", true);
        pluginGeneratedSerialDescriptor.j("isAgencyAvailable", true);
        pluginGeneratedSerialDescriptor.j("purchaseStopsInfo", true);
        pluginGeneratedSerialDescriptor.j("postPurchaseFlowType", true);
        pluginGeneratedSerialDescriptor.j("proofDocumentPropsList", true);
        pluginGeneratedSerialDescriptor.j("proofUploadDetailsMap", true);
        pluginGeneratedSerialDescriptor.j("preUploadedProofsMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassPurchaseSharedRestoredState.q;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{lazyArr[0].getValue(), BuiltinSerializersKt.c(AgencyInfoAppModel$$serializer.f8853a), BuiltinSerializersKt.c(stringSerializer), lazyArr[3].getValue(), BuiltinSerializersKt.c(PassApplicationRejectionReasons$$serializer.f9548a), BuiltinSerializersKt.c(stringSerializer), SuperPassUserDetails$$serializer.f9581a, BuiltinSerializersKt.c(BookableSuperPassConfiguration$$serializer.f5570a), BuiltinSerializersKt.c(longSerializer), longSerializer, BooleanSerializer.f18123a, BuiltinSerializersKt.c(SuperPassPurchaseStopsInfo$$serializer.f5666a), lazyArr[12].getValue(), lazyArr[13].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[14].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[15].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Source source;
        String str;
        Map map;
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo;
        Long l;
        List list;
        BookableSuperPassConfiguration bookableSuperPassConfiguration;
        String str2;
        PassApplicationActionRequired passApplicationActionRequired;
        SuperPassUserDetails superPassUserDetails;
        PassApplicationRejectionReasons passApplicationRejectionReasons;
        AgencyInfoAppModel agencyInfoAppModel;
        Map map2;
        boolean z;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassPurchaseSharedRestoredState.q;
        Map map3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Source source2 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            AgencyInfoAppModel agencyInfoAppModel2 = (AgencyInfoAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, AgencyInfoAppModel$$serializer.f8853a, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            PassApplicationActionRequired passApplicationActionRequired2 = (PassApplicationActionRequired) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            PassApplicationRejectionReasons passApplicationRejectionReasons2 = (PassApplicationRejectionReasons) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PassApplicationRejectionReasons$$serializer.f9548a, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            SuperPassUserDetails superPassUserDetails2 = (SuperPassUserDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, SuperPassUserDetails$$serializer.f9581a, null);
            BookableSuperPassConfiguration bookableSuperPassConfiguration2 = (BookableSuperPassConfiguration) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BookableSuperPassConfiguration$$serializer.f5570a, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo2 = (SuperPassPurchaseStopsInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, SuperPassPurchaseStopsInfo$$serializer.f5666a, null);
            PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType2 = (PostPassPurchaseSuccessFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            Map map4 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), null);
            map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), null);
            i = 65535;
            passApplicationActionRequired = passApplicationActionRequired2;
            z = zDecodeBooleanElement;
            bookableSuperPassConfiguration = bookableSuperPassConfiguration2;
            superPassUserDetails = superPassUserDetails2;
            str2 = str4;
            l = l2;
            passApplicationRejectionReasons = passApplicationRejectionReasons2;
            str = str3;
            agencyInfoAppModel = agencyInfoAppModel2;
            j = jDecodeLongElement;
            map = map4;
            list = list2;
            postPassPurchaseSuccessFlowType = postPassPurchaseSuccessFlowType2;
            superPassPurchaseStopsInfo = superPassPurchaseStopsInfo2;
            source = source2;
        } else {
            long jDecodeLongElement2 = 0;
            AgencyInfoAppModel agencyInfoAppModel3 = null;
            String str5 = null;
            Map map5 = null;
            PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType3 = null;
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo3 = null;
            Long l3 = null;
            List list3 = null;
            BookableSuperPassConfiguration bookableSuperPassConfiguration3 = null;
            String str6 = null;
            Source source3 = null;
            int i2 = 0;
            int i3 = 0;
            boolean zDecodeBooleanElement2 = false;
            int i4 = 3;
            int i5 = 1;
            PassApplicationActionRequired passApplicationActionRequired3 = null;
            SuperPassUserDetails superPassUserDetails3 = null;
            PassApplicationRejectionReasons passApplicationRejectionReasons3 = null;
            while (i5 != 0) {
                AgencyInfoAppModel agencyInfoAppModel4 = agencyInfoAppModel3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i5 = i3;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        map3 = map3;
                        i4 = 3;
                        i2 = i2;
                        i3 = i5;
                        break;
                    case 0:
                        int i6 = i3;
                        source3 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i3].getValue(), source3);
                        i2 |= 1;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        i3 = i6;
                        map3 = map3;
                        i4 = 3;
                        break;
                    case 1:
                        agencyInfoAppModel3 = (AgencyInfoAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, AgencyInfoAppModel$$serializer.f8853a, agencyInfoAppModel4);
                        i2 |= 2;
                        map3 = map3;
                        i4 = 3;
                        break;
                    case 2:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str5);
                        i2 |= 4;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        i4 = 3;
                        break;
                    case 3:
                        passApplicationActionRequired3 = (PassApplicationActionRequired) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), passApplicationActionRequired3);
                        i2 |= 8;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        str5 = str5;
                        break;
                    case 4:
                        passApplicationRejectionReasons3 = (PassApplicationRejectionReasons) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PassApplicationRejectionReasons$$serializer.f9548a, passApplicationRejectionReasons3);
                        i2 |= 16;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    case 5:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str6);
                        i2 |= 32;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    case 6:
                        superPassUserDetails3 = (SuperPassUserDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, SuperPassUserDetails$$serializer.f9581a, superPassUserDetails3);
                        i2 |= 64;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    case 7:
                        bookableSuperPassConfiguration3 = (BookableSuperPassConfiguration) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BookableSuperPassConfiguration$$serializer.f5570a, bookableSuperPassConfiguration3);
                        i2 |= 128;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    case 8:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, l3);
                        i2 |= 256;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    case 9:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
                        i2 |= 512;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    case 10:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i2 |= 1024;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    case 11:
                        superPassPurchaseStopsInfo3 = (SuperPassPurchaseStopsInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, SuperPassPurchaseStopsInfo$$serializer.f5666a, superPassPurchaseStopsInfo3);
                        i2 |= 2048;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    case 12:
                        postPassPurchaseSuccessFlowType3 = (PostPassPurchaseSuccessFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), postPassPurchaseSuccessFlowType3);
                        i2 |= 4096;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    case 13:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), list3);
                        i2 |= 8192;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    case 14:
                        map5 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), map5);
                        i2 |= 16384;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    case 15:
                        map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), map3);
                        i2 |= 32768;
                        str5 = str5;
                        agencyInfoAppModel3 = agencyInfoAppModel4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            source = source3;
            str = str5;
            map = map5;
            postPassPurchaseSuccessFlowType = postPassPurchaseSuccessFlowType3;
            superPassPurchaseStopsInfo = superPassPurchaseStopsInfo3;
            l = l3;
            list = list3;
            bookableSuperPassConfiguration = bookableSuperPassConfiguration3;
            str2 = str6;
            passApplicationActionRequired = passApplicationActionRequired3;
            superPassUserDetails = superPassUserDetails3;
            passApplicationRejectionReasons = passApplicationRejectionReasons3;
            agencyInfoAppModel = agencyInfoAppModel3;
            map2 = map3;
            z = zDecodeBooleanElement2;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassPurchaseSharedRestoredState(i, source, agencyInfoAppModel, str, passApplicationActionRequired, passApplicationRejectionReasons, str2, superPassUserDetails, bookableSuperPassConfiguration, l, j, z, superPassPurchaseStopsInfo, postPassPurchaseSuccessFlowType, list, map, map2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0150  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Code duplicated, block: B:82:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:87:0x0189 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x018b  */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType;
        List list;
        SuperPassPurchaseSharedRestoredState value = (SuperPassPurchaseSharedRestoredState) obj;
        Intrinsics.i(value, "value");
        Map map = value.p;
        Map map2 = value.o;
        List list2 = value.n;
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType2 = value.m;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = value.l;
        boolean z = value.k;
        long j = value.j;
        Long l = value.i;
        BookableSuperPassConfiguration bookableSuperPassConfiguration = value.h;
        SuperPassUserDetails superPassUserDetails = value.g;
        String str = value.f;
        PassApplicationRejectionReasons passApplicationRejectionReasons = value.e;
        PassApplicationActionRequired passApplicationActionRequired = value.d;
        String str2 = value.c;
        AgencyInfoAppModel agencyInfoAppModel = value.b;
        Source source = value.f8357a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassPurchaseSharedRestoredState.q;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || source != Source.UNKNOWN) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) lazyArr[r4].getValue(), source);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || agencyInfoAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, AgencyInfoAppModel$$serializer.f8853a, agencyInfoAppModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || passApplicationActionRequired != PassApplicationActionRequired.FRESH) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), passApplicationActionRequired);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || passApplicationRejectionReasons != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, PassApplicationRejectionReasons$$serializer.f9548a, passApplicationRejectionReasons);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(superPassUserDetails, new SuperPassUserDetails((String) null, (String) null, (String) null, Gender.NULL, (String) null, (String) null, (String) null, 247))) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, SuperPassUserDetails$$serializer.f9581a, superPassUserDetails);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || bookableSuperPassConfiguration != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, BookableSuperPassConfiguration$$serializer.f5570a, bookableSuperPassConfiguration);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || j != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 9, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || !z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 10, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || superPassPurchaseStopsInfo != 0) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, SuperPassPurchaseStopsInfo$$serializer.f5666a, superPassPurchaseStopsInfo);
        }
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12)) {
            if (postPassPurchaseSuccessFlowType != PostPassPurchaseSuccessFlowType.ACTIVATION) {
            }
            postPassPurchaseSuccessFlowType = postPassPurchaseSuccessFlowType2;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13)) {
                list = list2;
                if (!Intrinsics.d(list, EmptyList.f17557a)) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || map2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), map2);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || map != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), map);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            list = list2;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), list);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), map2);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), map2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), map);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), map);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        postPassPurchaseSuccessFlowType = postPassPurchaseSuccessFlowType2;
        postPassPurchaseSuccessFlowType = postPassPurchaseSuccessFlowType2;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), postPassPurchaseSuccessFlowType);
        postPassPurchaseSuccessFlowType = postPassPurchaseSuccessFlowType2;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13)) {
            list = list2;
            if (!Intrinsics.d(list, EmptyList.f17557a)) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), map2);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), map2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), map);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), map);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        list = list2;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), list);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), map2);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), map2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), map);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), map);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
