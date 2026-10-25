package app.chalo.ncmc.ui.entercarddetails;

import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel$$serializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/ui/entercarddetails/EnterCardDetailsRestoredState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsRestoredState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class EnterCardDetailsRestoredState$$serializer implements GeneratedSerializer<EnterCardDetailsRestoredState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnterCardDetailsRestoredState$$serializer f6333a;
    private static final SerialDescriptor descriptor;

    static {
        EnterCardDetailsRestoredState$$serializer enterCardDetailsRestoredState$$serializer = new EnterCardDetailsRestoredState$$serializer();
        f6333a = enterCardDetailsRestoredState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsRestoredState", enterCardDetailsRestoredState$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("chaloCardRechargeConfigAppModel", true);
        pluginGeneratedSerialDescriptor.j("maxDigitsAllowed", true);
        pluginGeneratedSerialDescriptor.j("currentEnteredCardNumber", true);
        pluginGeneratedSerialDescriptor.j("currentEnteredReEnterCardNumber", true);
        pluginGeneratedSerialDescriptor.j("cardNumberValidationError", true);
        pluginGeneratedSerialDescriptor.j("isProceedBtnEnabled", true);
        pluginGeneratedSerialDescriptor.j("isReEnterCardNumberFieldEnabled", true);
        pluginGeneratedSerialDescriptor.j("cardNumberToLink", true);
        pluginGeneratedSerialDescriptor.j("showCardLinkBottomSheet", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c(ChaloCardRechargeConfigAppModel$$serializer.f6127a);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, IntSerializer.f18146a, stringSerializer, stringSerializer, kSerializerC2, booleanSerializer, booleanSerializer, stringSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel;
        String str;
        boolean z2;
        boolean zDecodeBooleanElement;
        int i;
        int i2;
        String str2;
        String str3;
        String strDecodeStringElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel2 = (ChaloCardRechargeConfigAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ChaloCardRechargeConfigAppModel$$serializer.f6127a, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            chaloCardRechargeConfigAppModel = chaloCardRechargeConfigAppModel2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement2;
            str3 = strDecodeStringElement3;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            str = str4;
            str2 = strDecodeStringElement2;
            i = iDecodeIntElement;
            i2 = 511;
        } else {
            boolean z3 = true;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            int iDecodeIntElement2 = 0;
            int i6 = 0;
            ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement6 = false;
            String str5 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 0:
                        chaloCardRechargeConfigAppModel3 = (ChaloCardRechargeConfigAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ChaloCardRechargeConfigAppModel$$serializer.f6127a, chaloCardRechargeConfigAppModel3);
                        i6 |= 1;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i6 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str5);
                        i6 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i6 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i6 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i6 |= 128;
                        break;
                    case 8:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i6 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement4;
            chaloCardRechargeConfigAppModel = chaloCardRechargeConfigAppModel3;
            str = str5;
            z2 = zDecodeBooleanElement6;
            zDecodeBooleanElement = zDecodeBooleanElement5;
            i = iDecodeIntElement2;
            i2 = i6;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EnterCardDetailsRestoredState(i2, i, chaloCardRechargeConfigAppModel, str2, str3, str, strDecodeStringElement, z2, z, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        EnterCardDetailsRestoredState value = (EnterCardDetailsRestoredState) obj;
        Intrinsics.i(value, "value");
        boolean z = value.i;
        String str = value.h;
        boolean z2 = value.g;
        boolean z3 = value.f;
        String str2 = value.e;
        String str3 = value.d;
        String str4 = value.c;
        int i = value.b;
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = value.f6332a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || chaloCardRechargeConfigAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, ChaloCardRechargeConfigAppModel$$serializer.f6127a, chaloCardRechargeConfigAppModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || i != 16) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.d(str4, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.d(str3, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
